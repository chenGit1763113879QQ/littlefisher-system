package com.littlefisher.blog.common.enums;

import com.littlefisher.core.common.stereotype.enums.IEnum;

/**
 * Description: EnumTagState.java
 *
 * Created on 2017年12月27日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public enum EnumTagState implements IEnum {

    /** 有效 */
    VALID("有效"),
    /** 无效 */
    INVALID("无效");

    /** 描述 */
    private String desc;

    EnumTagState(String desc) {
        this.desc = desc;
    }

    @Override
    public IEnum find(String code) {
        for (EnumPostState enumPostState : EnumPostState.values()) {
            if (enumPostState.getCode().equals(code)) {
                return enumPostState;
            }
        }
        return null;
    }

    @Override
    public String getCode() {
        return this.name();
    }

    public String getDesc() {
        return desc;
    }
}
