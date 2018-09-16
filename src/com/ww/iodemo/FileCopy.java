package com.ww.iodemo;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        InputStream is=null;
        OutputStream os=null;
        try {
            File sourceFile=new File("E:\\mycode\\IO\\src\\com\\123.png");
            File destFile=new File("E:\\mycode\\IO\\src\\com\\456.png");
            if(!destFile.exists()){
                destFile.createNewFile();
            }
            is=new FileInputStream(sourceFile);
            os=new FileOutputStream(destFile);
            byte[] car=new byte[1024];
            int len=-1;
            while ((len=is.read(car))!=-1){
                os.write(car,0,len);
            }
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
            if(null!=is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
