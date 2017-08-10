package com.izhengyin.design.patterns.oop;

import com.izhengyin.design.patterns.oop.item1.MyClass;
import com.izhengyin.design.patterns.oop.item3.MyInterface;

/**
 * Created by zhengyin on 2017/8/4 上午9:17.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    public static void main(String[] args){

        MyClass myClass = new MyClass();

        MyInterface myInterface = new MyInterface() {
            public String hello() {
                return "Hello "+ name;
            }
        };
    }
}
