package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    //创建文件
    public void create(File file){
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("文件已经创建");
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
    // 获取文件信息
    public void showFileInfo(File file){
        if(file.exists()){
            if(file.isFile()){
                System.out.println("文件名称： "+file.getName());
                System.out.println("文件绝对路径："+file.getAbsolutePath());
                System.out.println("文件大小： "+file.length()+"个字节");
            }else if(file.isDirectory()){
                System.out.println(" 文件是个目录");

            }else{
                System.out.println("文件不存在");
            }
        }
    }

    // 删除文件
    public void delete(File file){
        if(file.exists()){
            file.delete();
            System.out.println("文件已经删除");
        }
    }

    // main
    public static void main(String[] args) {
        FileDemo filedemo = new FileDemo();
        File file = new File("/Users/ay/FileDemo.txt");
        filedemo.create(file);
        filedemo.showFileInfo(file);
        filedemo.delete(file);
    }
}
