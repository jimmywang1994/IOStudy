package com.ww.iodemo;

import java.io.ByteArrayOutputStream;

public class ByteArrayDemo02 {
    public static void main(String[] args) {
        byte[] dest = null;
        ByteArrayOutputStream bos = null;
        try {
            bos = new ByteArrayOutputStream();
            String msg = "show me the code";
            byte[] datas = msg.getBytes();
            bos.write(datas, 0, datas.length);
            bos.flush();
            dest = bos.toByteArray();
            System.out.println(dest.length + new String(dest, 0, bos.size()));
            
        } catch (Exception ex) {

        }
    }
}
