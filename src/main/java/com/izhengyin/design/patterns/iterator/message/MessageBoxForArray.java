package com.izhengyin.design.patterns.iterator.message;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zhengyin on 2017/8/10 下午3:36.
 * Email  <zhengyin.name@gmail.com> .
 */
public class MessageBoxForArray implements Aggregate{

    private int size;
    private int capacity;
    private Message[] messageList;


    public MessageBoxForArray(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.messageList = new Message[capacity];
    }

    public void appendMessage(Message message){
        ensureCapacity();
        messageList[size] = message;
        size ++;
    }

    public Message getMessageAt(int index){
        return messageList[index];
    }

    public Message[] getMessageList() {
        return messageList;
    }

    public int getSize(){
        return size;
    }

    @Override
    public Iterator iterator() {
        return new MessageBoxIteratorForArray(this);
    }

    /**
     *  确保 Array 有可用的空间
     */
    private void ensureCapacity(){
        if(messageList.length == size){
            messageList = Arrays.copyOf(messageList,messageList.length+capacity);
        }
    }
}
