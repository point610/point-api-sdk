package com.point.apisdk.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 无聊的话
 *
 * @TableName point_boring_talk
 */
@Data
public class PointBoringTalk implements Serializable {

    /**
     * 内容
     */
    private String value;

}