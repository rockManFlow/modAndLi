package com.model.controler;

import com.model.mybatis.entitys.SpringEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by caoqingyuan on 2017/7/20.
 */
@Service
public class Tests {
    @Autowired
    private SpringEntity springEntity;
    public void service(){
        System.out.println("Tests service springEntity:"+springEntity);
    }
}
