package com.ww.iodemo;

import jdk.internal.util.xml.impl.Input;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayDemo01 {
    public static void main(String[] args) {
        byte[] src = "talk is cheap show me the code".getBytes();
        InputStream is = null;
        try {
            is = new ByteArrayInputStream(src);
            int len = -1;
            byte[] flush = new byte[1024];
            while ((len = is.read(flush)) != -1) {
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            if(null==is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
