package com.littlefisher.blog.biz.cmd.post;

import org.springframework.beans.factory.annotation.Autowired;

import com.littlefisher.blog.dal.dao.IPostDtoDao;
import com.littlefisher.core.common.stereotype.annotations.Command;
import com.littlefisher.core.datasource.interceptor.AbstractCommand;

/**
 * Description:
 *
 * Created on 2017年5月23日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
@Command
public class DeletePostByIdCmd extends AbstractCommand<Integer> {

    /**
     * postId
     */
    private Long postId;

    @Autowired
    private IPostDtoDao postDtoDao;

    public DeletePostByIdCmd setPostId(Long postId) {
        this.postId = postId;
        return this;
    }

    @Override
    public Integer execute() {
        return postDtoDao.deleteByPrimaryKey(postId);
    }

}
