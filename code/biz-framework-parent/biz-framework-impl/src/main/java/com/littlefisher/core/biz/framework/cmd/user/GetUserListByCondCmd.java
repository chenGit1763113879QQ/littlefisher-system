package com.littlefisher.core.biz.framework.cmd.user;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.littlefisher.core.biz.framework.dao.ext.UserDtoExtMapper;
import com.littlefisher.core.biz.framework.model.UserDto;
import com.littlefisher.core.biz.framework.request.GetUserList4PagerByCondRequest;
import com.littlefisher.core.interceptor.AbstractCommand;

/**
 * Description:
 *
 * Created on 2017年5月24日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public class GetUserListByCondCmd extends AbstractCommand<List<UserDto>> {

    /**
     * req
     */
    private GetUserList4PagerByCondRequest req;

    /**
     * Description: 构造函数
     *
     * @param req req
     */
    public GetUserListByCondCmd(GetUserList4PagerByCondRequest req) {
        super();
        this.req = req;
    }

    @Override
    public List<UserDto> execute() {
        UserDtoExtMapper userDtoMapper = this.getMapper(UserDtoExtMapper.class);
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        return userDtoMapper.selectByCond(req);
    }

}
