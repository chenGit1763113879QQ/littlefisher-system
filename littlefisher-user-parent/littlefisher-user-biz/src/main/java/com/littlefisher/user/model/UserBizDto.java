package com.littlefisher.user.model;

import java.io.Serializable;
import java.util.Date;

import com.littlefisher.user.common.enums.EnumUserState;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author jinyn22648
 * @version $$Id: UserBizDto.java, v 0.1 2018/3/23 下午4:07 jinyn22648 Exp $$
 */
@ApiModel("用户信息")
public class UserBizDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 7085273168223717024L;

    /**
     * 主键
     */
    @ApiModelProperty("主键")
    private Long id;

    /**
     * 账号
     */
    @ApiModelProperty("账号")
    private String accNbr;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 中文真实姓名
     */
    @ApiModelProperty("中文真实姓名")
    private String realName;

    /**
     * 中文昵称
     */
    @ApiModelProperty("中文昵称")
    private String nickName;

    /**
     * 英文名称
     */
    @ApiModelProperty("英文名称")
    private String enName;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String userDesc;

    /**
     * 状态
     */
    @ApiModelProperty("状态")
    private EnumUserState state;

    /**
     * 注册时间
     */
    @ApiModelProperty("注册时间")
    private Date regDate;

    /**
     * 最后一次登录时间
     */
    @ApiModelProperty("最后一次登录时间")
    private Date lastLoginDate;

    public static final class Builder {

        private UserBizDto instance;

        private Builder() {}

        public static Builder getInstance() {
            Builder builder = new Builder();
            builder.instance = new UserBizDto();
            return builder;
        }

        public static Builder getInstance(UserBizDto instance) {
            Builder builder = new Builder();
            builder.instance = instance;
            return builder;
        }

        public Builder addId(Long id) {
            this.instance.setId(id);
            return this;
        }

        public Builder addAccNbr(String accNbr) {
            this.instance.setAccNbr(accNbr);
            return this;
        }

        public Builder addPassword(String password) {
            this.instance.setPassword(password);
            return this;
        }

        public Builder addRealName(String realName) {
            this.instance.setRealName(realName);
            return this;
        }

        public Builder addNickName(String nickName) {
            this.instance.setNickName(nickName);
            return this;
        }

        public Builder addEnName(String enName) {
            this.instance.setEnName(enName);
            return this;
        }

        public Builder addUserDesc(String userDesc) {
            this.instance.setUserDesc(userDesc);
            return this;
        }

        public Builder addState(EnumUserState state) {
            this.instance.setState(state);
            return this;
        }

        public Builder addRegDate(Date regDate) {
            this.instance.setRegDate(regDate);
            return this;
        }

        public Builder addLastLoginDate(Date lastLoginDate) {
            this.instance.setLastLoginDate(lastLoginDate);
            return this;
        }

        public UserBizDto build() {
            return this.instance;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public EnumUserState getState() {
        return state;
    }

    public void setState(EnumUserState state) {
        this.state = state;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Override
    public String toString() {
        return "UserBizDto{" + "id=" + id + ", accNbr='" + accNbr + '\'' + ", password='" + password + '\''
            + ", realName='" + realName + '\'' + ", nickName='" + nickName + '\'' + ", enName='" + enName + '\''
            + ", userDesc='" + userDesc + '\'' + ", state=" + state + ", regDate=" + regDate + ", lastLoginDate="
            + lastLoginDate + '}';
    }
}
