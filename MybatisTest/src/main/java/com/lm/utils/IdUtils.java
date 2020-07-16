package com.lm.utils;

import java.util.UUID;

/**
 * @author super
 */
public class IdUtils {

    /**
     * static关键字方便直接调用
     * 生成随机的uuid
     * @return uuid
     */
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");

    }

}
