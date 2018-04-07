package com.littlefisher.web.dal.integration.user;

import java.util.List;

import com.littlefisher.core.mybatis.pagehelper.PageInfo;
import com.littlefisher.user.model.UserBizDto;
import com.littlefisher.user.request.AddUserRequest;
import com.littlefisher.user.request.GetUserList4PageByCondRequest;
import com.littlefisher.user.request.UpdateUserRequest;

/**
 * Description: IUserIntegration.java
 *
 * Created on 2018年03月31日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
public interface IUserIntegration {

    /**
     * Description: 查询所有用户
     *
     * @return List<UserDto>
     */
    List<UserBizDto> getAllUser();

    /**
     * Description: 根据条件查询用户列表
     *
     * @param req req
     * @return List<UserDto>
     */
    PageInfo<UserBizDto> getUserList4PageByCond(GetUserList4PageByCondRequest req);

    /**
     * Description: 根据id查询用户
     *
     * @param userId userId
     * @return UserDto
     */
    UserBizDto getUserById(Long userId);

    /**
     * Description: 新增用户
     *
     * @param request userDto
     * @return UserDto
     */
    UserBizDto addUser(AddUserRequest request);

    /**
     * Description: 修改用户
     *
     * @param request userDto
     * @return UserDto
     */
    UserBizDto updateUser(UpdateUserRequest request);

    /**
     * Description: 删除用户
     *
     * @param userId userId
     * @return int
     */
    int deleteUser(Long userId);

    /**
     * 根据用户编号列表查询用户
     *
     * @param userIdList 用户编号列表
     * @return 用户
     */
    List<UserBizDto> getUserListByIdList(List<Long> userIdList);
}
