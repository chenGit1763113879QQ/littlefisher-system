package com.littlefisher.core.interceptor.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.littlefisher.core.engine.SystemEngine;
import com.littlefisher.core.interceptor.Command;
import com.littlefisher.core.interceptor.CommandConfig;
import com.littlefisher.core.interceptor.CommandExecutor;
import com.littlefisher.core.utils.StringUtil;

/**
 * Description:
 *
 * Created on 2017年2月10日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public class ServiceImpl implements InitializingBean, ApplicationContextAware {

    /**
     * commandExecutor
     */
    protected CommandExecutor commandExecutor;

    /**
     * systemEngine
     */
    @Autowired
    private SystemEngine systemEngine;

    @Autowired
    private ApplicationContext ac;

    /**
     * Description: <br>
     */
    private void init() {
        Class<? extends ServiceImpl> mClass = this.getClass();
        Service service = mClass.getAnnotation(Service.class);
        Component component = mClass.getAnnotation(Component.class);
        String value;
        if (service != null) {
            value = service.value();
        } else if (component != null) {
            value = component.value();
        } else {
            value = null;
        }
        if (StringUtil.isEmpty(value)) {
            value = StringUtil.uncapitalize(mClass.getSimpleName());
        }
        initService(value, this);
    }

    /**
     * Description: <br>
     *
     * @param serviceName <br>
     * @param serviceInstance <br>
     */
    public void initService(String serviceName, ServiceImpl serviceInstance) {
        systemEngine.initService(serviceName, serviceInstance);
    }

    /**
     * Description: <br>
     *
     * @param command <br>
     * @param <U> <U>
     * @return <br>
     */
    protected <U> U execute(Command<U> command) {
        return commandExecutor.execute(command);
    }

    /**
     * Description: <br>
     *
     * @param config <br>
     * CommandConfig.transactionNotSupported() 不带事务
     * CommandConfig.transactionRequiresNew()  新起事务
     * 缺省是 TransactionPropagation.REQUIRED
     * @param command <br>
     * @param <U> <U>
     * @return <br>
     */
    protected <U> U execute(CommandConfig config, Command<U> command) {
        return commandExecutor.execute(config, command);
    }

    /**
     * 获取Spring中的Command实例，且为新实例。每次请求的实例都不同
     * @param clazz Command实例
     * @param <U> <U>
     * @param <T> <T>
     * @return Command实例
     */
    protected <U, T extends Command<U>> T getCommand(Class<T> clazz) {
        return ac.getBean(clazz);
    }

    /**
     * Description: 当ServiceImpl实例化类时，会调用该方法，然后进行ServiceImpl的初始化操作
     */
    @Override
    public void afterPropertiesSet() {
        init();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ac = applicationContext;
    }

    /**
     * Description: <br>
     *
     * @return CommandExecutor <br>
     */
    public CommandExecutor getCommandExecutor() {
        return commandExecutor;
    }

    /**
     * Description: <br>
     *
     * @param commandExecutor <br>
     */
    public void setCommandExecutor(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }
}
