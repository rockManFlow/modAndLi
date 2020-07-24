package com.model.test.shiwu;

import java.sql.Connection;
import java.util.List;

/**
 * Created by caoqingyuan on 2016/11/24.
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        //name=hhhhage=19
        Connection conn=AppUtil.createSelfMysqlConn().getM_Connection();
        List<MainPojo> mainPojos = ServiceTest.select1(conn,1,1);
        for(MainPojo m:mainPojos){
            System.out.println("name="+m.getName()+"age="+m.getAge());
        }
        ServiceTest.update1(conn);
//        ServiceTest.reflush(conn);
        List<MainPojo> pojos = ServiceTest.select1(conn,2,1);
        for(MainPojo m:pojos){
            System.out.println("name="+m.getName()+"age="+m.getAge());
        }
        conn.close();
    }
}
