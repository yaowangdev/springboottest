package com.yaowang.springboottest.util;

public class JsonUtils {

    /**
     * 直接返回操作成功的JSON字符串
     */
    public static String jsonSuccess() {
        return "{\"success\":true}";
    }

    /**
     * 直接返回操作成功的JSON字符串
     * 2012.05.31 update by hunter 防止换行导致前台报错
     */
    public static String jsonSuccess(String message) {
        if (message != null)
            return "{\"success\":true,\"message\":\"" + message.replaceAll("\r?\n", "").replace("\"", "") + "\"}";
        else
            return jsonSuccess();
    }

    public static String jsonSuccess(String message, Object id) {
        if (message != null)
            return "{\"success\":true,\"message\":\"" + message.replaceAll("\r?\n", "").replace("\"", "") + "\",\"id\":\"" + id + "\"}";
        else
            return jsonSuccess();
    }


    /**
     * 直接返回操作失败的JSON字符串
     */
    public static String jsonFailture() {
        return "{\"success\":false}";
    }

    /**
     * 直接返回操作成功的JSON字符串
     * 2012.05.31 update by hunter 防止换行导致前台报错
     */
    public static String jsonFailture(String message) {
        if (message != null) {
            message = message.replaceAll("^.*(ORA-.*$)", "$1").replaceAll("\r?\n", "").replace("\"", "");
            return "{\"success\":false,\"message\":\"" + message + "\"}";
        } else
            return jsonFailture();
    }





}
