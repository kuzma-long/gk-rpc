package com.clong.gkrpc.transport;

/*
 * 在RPC场景下server需要做的事有哪些？
 * 1. 启动，监听
 * 2. 接受请求
 * 3. 关闭监听
 * */
public interface TransportServer {
    //Request应该在初始化的时候就传给server，所以我们添加一个init方法
    void init(int port, RequestHandler handler);

    void start();

    void stop();
}
