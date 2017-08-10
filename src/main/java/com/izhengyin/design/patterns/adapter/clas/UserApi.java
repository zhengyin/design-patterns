package com.izhengyin.design.patterns.adapter.clas;

/**
 * Created by zhengyin on 2017/8/5 上午11:03.
 * Email  <zhengyin.name@gmail.com> .
 */
public class UserApi extends OldUserApi implements Restful{

    public String get() {
        return getUser();
    }

    public String post() {
        return addUser();
    }

    public String put() {
        return updateUser();
    }

    public String delete() {
        return deleteUser();
    }
}
