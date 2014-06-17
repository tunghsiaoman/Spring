package com.project.utils;

public final class StringUtils {
	/**
     * Object转换成Long
     *
     * @param obj
     * @return
     */
    public static Long getLong(Object obj) {
        return getLong(obj, 0L);
    }
    
    /**
     * Object转换成Long
     *
     * @param obj
     * @return
     */
    public static Long getLong(Object obj, Long defaultValue) {
        try {
            return Long.valueOf(obj + "");
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
