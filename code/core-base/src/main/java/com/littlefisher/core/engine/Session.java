package com.littlefisher.core.engine;

/**
 * 
 * Description: 
 *  
 * Created on 2017年2月10日 
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public interface Session {
    
    void flush();

    void close();
}
