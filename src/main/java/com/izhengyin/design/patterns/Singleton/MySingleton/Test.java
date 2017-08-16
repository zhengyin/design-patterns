package com.izhengyin.design.patterns.Singleton.MySingleton;



import com.izhengyin.design.patterns.Singleton.MySingleton.field.MySingleton;
import com.izhengyin.design.patterns.Singleton.MySingleton.field.MySingleton2;

import java.io.*;

/**
 * Created by zhengyin on 2017/8/4 上午10:24.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    public static void main(String[] args) throws Exception{
        MySingleton2.INSTANCE.say();
        MySingleton2.INSTANCE.say();
        testEnum();
        testSingletonSerializable();
    }

    private static void testEnum(){
        MySingleton mySingleton1 = MySingleton.INSTANCE;
        mySingleton1.say();
        MySingleton mySingleton2 = MySingleton.INSTANCE;
        mySingleton2.say();
    }


    /**
     * 测试单例序列化与反序列化
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static void testSingletonSerializable() throws IOException, ClassNotFoundException {
        MySingleton mySingleton = MySingleton.INSTANCE;
        File mySingletonSerFile = new File("/tmp/mySingleton.ser");
        mySingleton.say();
        if(mySingletonSerFile.exists()){
            mySingletonSerFile.delete();
        }
        if(mySingletonSerFile.createNewFile()){
            FileOutputStream outputStream = new FileOutputStream(mySingletonSerFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(mySingleton);
            FileInputStream inputStream = new FileInputStream(mySingletonSerFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            MySingleton mySingleton2 = (MySingleton) objectInputStream.readObject();
            mySingleton2.say();
            // close Stream
            outputStream.close();
            objectInputStream.close();
            inputStream.close();
            objectInputStream.close();
        }
    }
}
