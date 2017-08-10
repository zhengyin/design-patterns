package com.izhengyin.design.patterns.adapter.obj;

/**
 * Created by zhengyin on 2017/8/5 上午11:31.
 * Email  <zhengyin.name@gmail.com> .
 */
public class DataApi implements Restful{
    private OldDataApi oldDataApi;
    public DataApi(){
        this.oldDataApi = new OldDataApi();
    }

    public String get() {
        return oldDataApi.getData();
    }

    public String post() {
        return oldDataApi.addData();
    }

    public String put() {
        return oldDataApi.updateData();
    }

    public String delete() {
        return oldDataApi.deleteData();
    }
}
