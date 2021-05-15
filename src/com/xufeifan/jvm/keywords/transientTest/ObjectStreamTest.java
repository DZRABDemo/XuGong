package com.xufeifan.jvm.keywords.transientTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.keywords.transientTest
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/12 10:22
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class ObjectStreamTest {
    public static void main(String[] args) {
        //首先 创建一个对象
        User user = new User("张三",20,100);
        File file = new File("D:/URL/Test1.txt");

        ObjectOutputStream oos=null;
        try{
            oos=new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(user);

            oos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
