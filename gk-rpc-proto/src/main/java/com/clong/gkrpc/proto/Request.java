package com.clong.gkrpc.proto;

import lombok.Data;

/**
 * @className: Request
 * @Description: 表示RPC的一个请求
 * @version: jdk1.8
 * @author: clong
 * @date: 2022/4/8 17:47
 */
@Data
public class Request {
    // 这里的实参将会在client调用方法时通过动态代理获取，并且通过http协议传递到Server进行处理。
    // 而在Server中会根据传递的class与实例通过反射进行实际方法的执行，最后将执行结果通过Response类进行返回。
    private ServiceDescriptor service;
    private Object[] parameters;
}
