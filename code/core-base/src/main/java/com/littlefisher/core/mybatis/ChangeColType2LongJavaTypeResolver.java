package com.littlefisher.core.mybatis;

import java.sql.Types;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * Description: mybatis数据类型转换时，遇到数值型的，都转为Long
 *
 * Created on 2017年1月16日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public class ChangeColType2LongJavaTypeResolver extends JavaTypeResolverDefaultImpl {

    @Override
    public FullyQualifiedJavaType calculateJavaType(IntrospectedColumn introspectedColumn) {
        FullyQualifiedJavaType answer;
        JdbcTypeInformation jdbcTypeInformation = typeMap.get(introspectedColumn.getJdbcType());

        if (jdbcTypeInformation == null || Types.INTEGER == introspectedColumn.getJdbcType()) {
            switch (introspectedColumn.getJdbcType()) {
                case Types.DECIMAL:
                case Types.NUMERIC:
                case Types.INTEGER:
                    answer = new FullyQualifiedJavaType(Long.class.getName());
                    break;

                default:
                    answer = null;
                    break;
            }
        } else {
            answer = jdbcTypeInformation.getFullyQualifiedJavaType();
        }
        return answer;
    }
}
