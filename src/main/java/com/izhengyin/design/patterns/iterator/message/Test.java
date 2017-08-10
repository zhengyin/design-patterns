package com.izhengyin.design.patterns.iterator.message;

/**
 * Created by zhengyin on 2017/8/10 下午4:22.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){
        MessageBox messageBox  = new MessageBox();
        for(int i=0;i<100;i++){
            messageBox.appendMessage(new Message("A"+i,"a"+i));
        }
        Iterator iterator = messageBox.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- ");
        // 更换具体集合与具体迭代器实现
        MessageBoxForArray messageBoxForArray = new MessageBoxForArray(16);
        for(int i=0;i<100;i++){
            messageBoxForArray.appendMessage(new Message("A"+i,"a"+i));
        }
        iterator = messageBoxForArray.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
