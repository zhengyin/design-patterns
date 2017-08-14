package com.izhengyin.design.patterns.prototype.move_history.framework;

import java.util.*;

/**
 * Created by zhengyin on 2017/8/14 下午3:57.
 * Email  <zhengyin.name@gmail.com> .
 */
public class HistoryManager {

    private List<DotProduct> historys = new ArrayList<>();
    private int index = -1;


    public DotProduct ctrlz(){
        index -- ;
        return create();
    }
    public DotProduct ctrls(DotProduct actionProduct){
        return register(actionProduct);
    }

    private DotProduct register(DotProduct actionProduct){
        index ++;
        historys.add(actionProduct);
        return actionProduct.createClone();
    }

    private DotProduct create(){
        if(index < 0){
            throw new ArrayIndexOutOfBoundsException("没有历史记录可以撤销");
        }
        return historys.get(index).createClone();
    }

    public void history(){
        for(int i=0;i<historys.size();i++){
            System.out.println(i+"  => "+historys.get(i));
        }
    }
}
