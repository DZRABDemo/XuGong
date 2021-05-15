package com.xufeifan.jvm.keywords.transientTest;

import java.io.*;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.keywords.transientTest
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/12 10:28
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class ObjectInStream {
    public static void main(String[] args) {
        File file = new File("D:/URL/Test1.txt");

        ObjectInputStream ois=null;
        try{
            ois=new ObjectInputStream(new FileInputStream(file));

            User user =(User) ois.readObject();

            System.out.println(user);
            //这里确实没有读到对应的数据


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
