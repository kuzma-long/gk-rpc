package com.clong.gkrpc.proto.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * 反射工具
 */
@Slf4j
public class ReflectionUtils {
    /**
     * 根据class创建对象
     *
     * @param clazz 待创建对象的类
     * @param <T>   对象类型
     * @return 创建好的对象
     */
    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * 获取某个class的公有方法
     */
    public static Method[] getPublicMethods(Class clazz) {
        // 类自身所有的方法，包括私有，公共等，不包含父类的
        Method[] methods = clazz.getDeclaredMethods();
        List<Method> pMethods = new ArrayList<>();
        //过滤出公共方法
        for (Method method : methods) {
            if (Modifier.isPublic(method.getModifiers())) {
                pMethods.add(method);
            }
        }
        return pMethods.toArray(new Method[0]);
    }


    /*
     * @Description 调用指定对象的指定方法
     * @Param obj: 被调用方法的对象
     * @Param method: 被调用的方法
     * @Param args: 方法需要的参数
     * @return 返回结果
     **/
    public static Object invoke(Object obj, Method method, Object... args) {
        try {
            // 在具有指定参数的指定对象上调用由此 Method 对象表示的基础方法。各个参数会自动解包以匹配原始形式参数，并且原始参数和引用参数都会根据需要进行方法调用转换。
            return method.invoke(obj, args);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
