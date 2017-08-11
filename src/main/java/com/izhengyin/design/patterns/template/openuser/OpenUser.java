package com.izhengyin.design.patterns.template.openuser;

/**
 * Created by zhengyin on 2017/8/11 下午5:23.
 * Email  <zhengyin.name@gmail.com> .
 */
abstract class OpenUser {

    public User getUserInfo(){
        String accessToken = getAccessToken();
        return getOpenUserInfo(accessToken);
    }

    abstract  String getAccessToken();
    abstract  User getOpenUserInfo(String accessToken);

}
