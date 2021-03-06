package com.littlefisher.web.dal.integration.blog.impl;

import org.springframework.stereotype.Repository;

import com.alibaba.dubbo.config.annotation.Reference;
import com.littlefisher.blog.biz.model.AuthorBizExtDto;
import com.littlefisher.blog.biz.service.IAuthorService;
import com.littlefisher.web.dal.integration.blog.IAuthorIntegration;

/**
 * Description: AuthorIntegrationImpl.java
 *
 * Created on 2018年03月31日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
@Repository
public class AuthorIntegrationImpl implements IAuthorIntegration {

    @Reference
    private IAuthorService authorService;

    @Override
    public AuthorBizExtDto getAuthorInfo4Index(Long authorId) {
        return authorService.getAuthorInfo4Index(authorId);
    }
}
