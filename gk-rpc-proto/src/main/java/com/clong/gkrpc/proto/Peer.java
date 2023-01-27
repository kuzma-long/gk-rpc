package com.clong.gkrpc.proto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: Peer
 * @Description: 表示网络传输的端点
 * @version: jdk1.8
 * @author: clong
 * @date: 2022/4/8 17:41
 */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
