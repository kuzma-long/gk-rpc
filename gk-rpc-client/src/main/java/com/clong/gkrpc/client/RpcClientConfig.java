package com.clong.gkrpc.client;

import com.clong.gkrpc.transport.HTTPTransportClientImpl;
import com.clong.gkrpc.proto.Peer;
import com.clong.gkrpc.transport.TransportClient;
import com.clong.gkrpc.proto.codec.Decoder;
import com.clong.gkrpc.proto.codec.Encoder;
import com.clong.gkrpc.proto.codec.JSONDecoder;
import com.clong.gkrpc.proto.codec.JSONEncoder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @className: RpcClientConfig
 * @Description: TODO
 * @version: jdk1.8
 * @author: clong
 * @date: 2022/5/1 18:22
 */
@Data
public class RpcClientConfig {
    //确定具体实现
    private Class<? extends TransportClient> transportClient = HTTPTransportClientImpl.class;

    private Class<? extends Encoder> encodeClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    //选择路由
    private Class<? extends TransportSelector> selectClass = RandomTransportSelector.class;
    //确定client与server建立几个连接，默认一个
    private int connectCount = 1;
    //可以连哪些网络端点
    private List<Peer> servers = Arrays.asList(
            //给端点赋默认值
            new Peer("127.0.0.1", 3000)
    );
}
