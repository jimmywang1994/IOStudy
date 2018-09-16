package com.ww.iodemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileDemo02 {
    public static void main(String[] args) {
        OutputStream os=null;
        try {
            File file=new File("E:\\mycode\\IO\\src\\com\\text.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            os=new FileOutputStream(file);
            String msg="io is so easy";
            byte[] bytes=msg.getBytes();//字符串--》字节数组 编码
            os.write(bytes,0,bytes.length);
            os.flush();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            if(null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
