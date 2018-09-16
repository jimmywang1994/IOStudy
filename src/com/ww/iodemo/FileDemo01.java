package com.ww.iodemo;

import java.io.*;

public class FileDemo01 {
    public static void main(String[] args) {
        File file=new File("E:\\mycode\\IO\\src\\com\\abc.txt");
        InputStream inputStream=null;
        try {
            inputStream=new FileInputStream(file);
            byte[] car=new byte[1024];
            int len=-1;
            while ((len=inputStream.read(car))!=-1){
                String str=new String(car,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null!=inputStream){
                    inputStream.close();
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
