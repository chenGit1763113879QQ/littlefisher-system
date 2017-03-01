package com.yc.room1000.engine.attr.cmd;

import com.yc.room1000.core.exception.BaseAppException;
import com.yc.room1000.core.interceptor.AbstractCommand;
import com.yc.room1000.engine.attr.dao.AttrDtoMapper;

/**
 * 
 * Description: 
 *  
 * Created on 2017年3月1日 
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public class DeleteAttrCmd extends AbstractCommand {
    
    /**
     * attrId
     */
    private Long attrId;
    
    /**
     * DeleteAttrCmd
     * 
     * @param attrId attrId
     */
    public DeleteAttrCmd(Long attrId) {
        this.attrId = attrId;
    }



    @Override
    public Integer execute() throws BaseAppException {
        AttrDtoMapper attrDtoMapper = this.getMapper(AttrDtoMapper.class);
        return attrDtoMapper.deleteByPrimaryKey(attrId);
    }

}
