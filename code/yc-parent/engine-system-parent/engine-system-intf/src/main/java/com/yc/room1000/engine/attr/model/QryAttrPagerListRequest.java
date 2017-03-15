package com.yc.room1000.engine.attr.model;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

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
@ApiModel(value = "查询Attr列表的入参条件，分页用")
public class QryAttrPagerListRequest extends QryAttrListRequest {

    /**
     * pageNum 页码
     */
    @ApiModelProperty(value = "页码")
    private int pageNum;
    
    /**
     * pageSize 每页行数
     */
    @ApiModelProperty(value = "每页行数")
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("QryAttrPagerListRequest [pageNum=");
        builder.append(pageNum);
        builder.append(", pageSize=");
        builder.append(pageSize);
        builder.append("]");
        return builder.toString();
    }
    
    
}