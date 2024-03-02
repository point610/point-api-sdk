package com.point.apisdk.utils;

import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONUtil;
import com.point.apisdk.common.BaseResponse;
import com.point.apisdk.exception.BusinessException;

/**
 * 签名工具
 */
public class CheckUtils {
    public static BaseResponse CheckResponse(HttpResponse httpResponse) {
        if (httpResponse.getStatus() != 200) {
            throw new BusinessException(httpResponse.getStatus(), "请求失败");
        }

        String result = httpResponse.body();
        BaseResponse baseResponse = JSONUtil.toBean(result, BaseResponse.class);

        // 检查 BaseResponse
        if (baseResponse.getCode() != 0) {
            throw new BusinessException(baseResponse.getCode(), baseResponse.getMessage());
        }
        return baseResponse;
    }

}
