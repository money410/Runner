package com.runner.commons.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @author: 王永
 * @date: 2020/8/20  17:44
 */
@Data
public class PicDto implements Serializable {
    private Integer pid;
    private int talkId;
    private String picUrl;
    private int ossId;
    private int articleId;
}
