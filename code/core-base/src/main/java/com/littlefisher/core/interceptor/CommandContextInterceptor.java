package com.littlefisher.core.interceptor;

import com.littlefisher.core.engine.SystemEngineConfig;
import com.littlefisher.core.exception.BaseAppException;
import com.littlefisher.core.interceptor.context.Context;
import com.littlefisher.core.utils.LittleFisherLogger;

/**
 * Description: Command上下文拦截器
 *
 * Created on 2017年2月10日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public class CommandContextInterceptor extends AbstractCommandInterceptor {

    /**
     * logger
     */
    private static LittleFisherLogger logger = LittleFisherLogger
            .getLogger(CommandContextInterceptor.class);

    /**
     * commandContextFactory
     */
    protected CommandContextFactory commandContextFactory;

    /**
     * systemEngineConfig
     */
    protected SystemEngineConfig systemEngineConfig;

    public CommandContextInterceptor() {
    }

    public CommandContextInterceptor(CommandContextFactory commandContextFactory,
                                     SystemEngineConfig systemEngineConfig) {
        this.commandContextFactory = commandContextFactory;
        this.systemEngineConfig = systemEngineConfig;
    }

    @Override
    public <U> U execute(CommandConfig config, Command<U> command) {
        CommandContext context = Context.getCommandContext();

        boolean contextReused = false;
        if (!config.isContextReusePossible() || context == null || context.getException() != null) {
            context = commandContextFactory.createCommandContext(command);
        } else {
            logger.debug("Valid context found. Reusing it for the current command [{}]",
                    command.getClass().getCanonicalName());
            contextReused = true;
        }
        try {
            // Push on stack
            Context.setCommandContext(context);
            Context.setSystemEngineConfig(systemEngineConfig);

            return next.execute(config, command);

        } catch (BaseAppException e) {

            context.exception(e);
            throw e;

        } finally {
            try {
                if (!contextReused) {
                    context.close();
                }
            } finally {
                // Pop from stack
                Context.removeCommandContext();
                Context.removeSystemEngineConfig();
            }
        }

    }
}
