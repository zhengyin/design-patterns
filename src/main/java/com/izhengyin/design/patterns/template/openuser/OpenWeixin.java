package com.izhengyin.design.patterns.template.openuser;

/**
 * Created by zhengyin on 2017/8/11 下午5:39.
 * Email  <zhengyin.name@gmail.com> .
 */
public class OpenWeixin extends OpenUser{
    @Override
    String getAccessToken() {

        // call weixin Api

        return "WeixinAccessToken";
    }

    @Override
    User getOpenUserInfo(String accessToken) {

        // call weixin Api

        return new User("openId_weixin" );
    }
}
