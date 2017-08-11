package com.izhengyin.design.patterns.template.openuser;

import com.alibaba.fastjson.JSON;

/**
 * Created by zhengyin on 2017/8/11 下午5:23.
 * Email  <zhengyin.name@gmail.com> .
 */
public class User {
    private final String openId;

    public User(String openId) {
        this.openId = openId;
    }

    public String getOpenId() {
        return openId;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
