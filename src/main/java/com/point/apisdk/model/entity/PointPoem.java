package com.point.apisdk.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 诗词
 * @TableName point_poem
 */
@Data
public class PointPoem implements Serializable {
    /**
     * 内容
     */
    private String value;
}