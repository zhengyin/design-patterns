package com.izhengyin.design.patterns.iterator.message;


import java.util.ArrayList;

/**
 * Created by zhengyin on 2017/8/10 下午3:36.
 * Email  <zhengyin.name@gmail.com> .
 */
public class MessageBox implements Aggregate{

    private ArrayList<Message> messageList;

    public MessageBox (){
        messageList = new ArrayList<>();
    }

    public void appendMessage(Message message){
        messageList.add(message);
    }

    public Message getMessageAt(int index){
        return messageList.get(index);
    }

    public ArrayList<Message> getMessageList() {
        return messageList;
    }

    @Override
    public Iterator iterator() {
        return new MessageBoxIterator(this);
    }
}
