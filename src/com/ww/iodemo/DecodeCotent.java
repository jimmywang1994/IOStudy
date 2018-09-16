package com.ww.iodemo;

import java.io.UnsupportedEncodingException;

public class DecodeCotent {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg="性命生命使命a";
        byte[] bytes=msg.getBytes();//默认使用工程的字符集

        //编码：字符串
        msg=new String(bytes,0,bytes.length,"utf-8");
        System.out.println(msg);

        //乱码：字节数不够
        msg=new String(bytes,0,bytes.length-2,"utf-8");
        System.out.println(msg);

        //乱码：编码不统一
        msg=new String(bytes,0,bytes.length-2,"gbk");
        System.out.println(msg);
    }
}
