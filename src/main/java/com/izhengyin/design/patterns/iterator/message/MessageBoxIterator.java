package com.izhengyin.design.patterns.iterator.message;

/**
 * Created by zhengyin on 2017/8/10 下午3:36.
 * Email  <zhengyin.name@gmail.com> .
 */
public class MessageBoxIterator implements Iterator {

    private int index;
    private MessageBox messageBox;

    public MessageBoxIterator(MessageBox messageBox){
        this.messageBox = messageBox;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < messageBox.getMessageList().size();
    }

    @Override
    public Object next() {
        Message message = messageBox.getMessageAt(index);
        index ++;
        return message;
    }
}
