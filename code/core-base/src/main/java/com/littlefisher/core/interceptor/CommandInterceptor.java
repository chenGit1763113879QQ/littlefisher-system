package com.littlefisher.core.interceptor;

import com.littlefisher.core.exception.BaseAppException;

/**
 * Description:
 *
 * Created on 2017年2月10日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public interface CommandInterceptor {

    <U> U execute(CommandConfig config, Command<U> command) throws BaseAppException;

    CommandInterceptor getNext();

    void setNext(CommandInterceptor next);
}
