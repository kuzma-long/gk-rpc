package com.clong.gkrpc.proto.codec;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: TestBean
 * @Description: TODO
 * @version: jdk1.8
 * @author: asher
 * @date: 2022/4/9 17:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestBean {
    private String name;
    private int age;

    public int add(int i, int b) {
        System.out.println(i+b);
        return i+b;
    }

}
