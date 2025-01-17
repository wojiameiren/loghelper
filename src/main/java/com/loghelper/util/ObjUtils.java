package com.loghelper.util;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 
 *  对象、属性处理
 * author: cuitianhao
 **/
public class ObjUtils {
    private static final String OBJECT_PATH = "java.lang.object";

    /**
     * 获取包括所有的属性
     *
     * @param objSource 对象
     * @return  属性
     */
    public static Field[] getAllFields(Object objSource) {
        //获得当前类的所有属性
        List<Field> fieldList = new ArrayList<>();
        Class<?> tempClass = objSource.getClass();
        //当父类为null的时候说明到达了最上层的父类(Object类).
        while (tempClass != null && !OBJECT_PATH.equalsIgnoreCase(tempClass.getName())) {
            fieldList.addAll(Arrays.asList(tempClass.getDeclaredFields()));
            tempClass = tempClass.getSuperclass();
        }
        Field[] fields = new Field[fieldList.size()];
        fieldList.toArray(fields);
        return fields;
    }

}
