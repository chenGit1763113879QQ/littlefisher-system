package com.littlefisher.core.mybatis.mapper.common;

import com.littlefisher.core.mybatis.mapper.common.base.BaseMapper;
import com.littlefisher.core.mybatis.mapper.common.example.SelectByExampleMapper;

import tk.mybatis.mapper.common.Mapper;

/**
 * Description: CommonMapper.java
 *
 * Created on 2018年01月05日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public interface CommonMapper<T> extends Mapper<T>, BaseMapper<T>, SelectByExampleMapper<T> {}
