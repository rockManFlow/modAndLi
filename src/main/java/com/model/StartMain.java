package com.model;

import com.model.activeMQ.QueueTask;

/**
 * Created by caoqingyuan on 2016/9/13.
 */
public class StartMain {
    public static void main(String[] args){
        //TimeTask可以直接起来
        QueueTask.schedule();
    }
}
