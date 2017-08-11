package com.izhengyin.design.patterns.template.openuser;

/**
 * Created by zhengyin on 2017/8/11 下午5:37.
 * Email  <zhengyin.name@gmail.com> .
 */
public class OpenWeibo extends OpenUser{
    @Override
    String getAccessToken() {
        // call weibo Api

        return "WeiboAccessToken";
    }

    @Override
    User getOpenUserInfo(String accessToken) {
        // call weibo Api

        return new User("openId_weibo" );
    }

}
