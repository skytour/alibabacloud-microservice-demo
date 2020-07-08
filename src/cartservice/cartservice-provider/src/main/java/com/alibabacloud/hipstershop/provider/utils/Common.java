package com.alibabacloud.hipstershop.provider.utils;

import com.alibabacloud.hipstershop.provider.domain.RedisKey;

/**
 * @author xiaofeng.gxf
 * @date 2020/7/7
 */
public class Common {
    public static RedisKey getRedisKey(String userId){
        return new RedisKey(Constant.REDIS_CART, userId);
    }
}
