package com.littlefisher.blog.system.cmd;

import com.littlefisher.core.exception.BaseAppException;
import com.littlefisher.core.interceptor.AbstractCommand;

/**
 * 
 * Description: 根据key删除系统参数
 *  
 * Created on 2017年5月23日 
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public class DeleteSystemParamByKeyCmd extends AbstractCommand<Integer> {
    
    /**
     * paramKey
     */
    private String paramKey;

    /** 
     * Description: 
     *
     * @author jinyanan
     *
     * @param paramKey paramKey 
     */ 
    public DeleteSystemParamByKeyCmd(String paramKey) {
        super();
        this.paramKey = paramKey;
    }

    @Override
    public Integer execute() throws BaseAppException {
        // TODO Auto-generated method stub
        return null;
    }

}
