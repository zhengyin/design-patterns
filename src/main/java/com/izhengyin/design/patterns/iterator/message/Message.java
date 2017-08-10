package com.izhengyin.design.patterns.iterator.message;

import com.alibaba.fastjson.JSON;

/**
 * Created by zhengyin on 2017/8/10 下午3:36.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Message {
    private String sender;
    private String receiver;

    public Message(String sender , String receiver){
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
