package com.stone.learn.zqflinklearn;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * ${DESCRIPTION}
 *
 * @author qun.zheng
 * @create 2018/10/24
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(new ClassPathResource("asset").getURL().toString());
    }
}
