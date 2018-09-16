package com.ww.iodemo;

import java.io.UnsupportedEncodingException;

public class IODemo1 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg="性命生命使命a";
        //编码
        byte[] bytes=msg.getBytes();//默认使用工程的字符集
        System.out.println(bytes.length);

        //编码其他字符集
        bytes=msg.getBytes("UTF-16LE");
        System.out.println(bytes.length);

        bytes=msg.getBytes("GBK");
        System.out.println(bytes.length);

    }
}
