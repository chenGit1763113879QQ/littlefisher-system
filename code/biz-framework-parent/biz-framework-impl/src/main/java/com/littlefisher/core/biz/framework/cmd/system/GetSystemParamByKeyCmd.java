package com.littlefisher.core.biz.framework.cmd.system;

import java.util.List;

import com.littlefisher.core.biz.framework.dao.SystemParamDtoMapper;
import com.littlefisher.core.biz.framework.example.SystemParamDtoExample;
import com.littlefisher.core.biz.framework.model.SystemParamDto;
import com.littlefisher.core.interceptor.AbstractCommand;
import com.littlefisher.core.utils.CollectionUtil;

/**
 * Description: 根据key查询系统参数
 *
 * Created on 2017年5月23日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public class GetSystemParamByKeyCmd extends AbstractCommand<SystemParamDto> {

    /**
     * paramKey
     */
    private String paramKey;

    /**
     * Description: 构造函数
     *
     * @param paramKey paramKey
     */
    public GetSystemParamByKeyCmd(String paramKey) {
        super();
        this.paramKey = paramKey;
    }

    @Override
    public SystemParamDto execute() {
        SystemParamDtoMapper systemParamDtoMapper = this.getMapper(SystemParamDtoMapper.class);
        SystemParamDtoExample example = new SystemParamDtoExample();
        example.createCriteria().andParamKeyEqualTo(paramKey);
        List<SystemParamDto> systemParamList = systemParamDtoMapper.selectByExample(example);
        return CollectionUtil.isNotEmpty(systemParamList) ? systemParamList.get(0) : null;
    }

}
