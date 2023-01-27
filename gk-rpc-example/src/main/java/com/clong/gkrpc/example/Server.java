package com.clong.gkrpc.example;

import com.clong.gkrpc.proto.server.RpcServer;

/**
 * @className: Server
 * @Description: TODO
 * @version: jdk1.8
 * @author: clong
 * @date: 2022/5/3 18:13
 */
public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer();
        server.register(CalService.class, new CalServiceImpl());
        server.start();
    }
}
