package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream first = null;
        try {
            // 创建流的对象
            first = new FileInputStream("/Users/ay/JavaExercise/基础语法/src/com/io/test.txt");
            // 借助FileInputStream对象的read()方法读取文件
            int data;
            while((data=first.read())!=-1){
                System.out.print                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ((char)data);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();

        } finally {
            // 关闭输入流
            try{
                first.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        // 构建流
    }
}
