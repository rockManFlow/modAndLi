package com.model.test.shiwu;

import aming.framework.db.DefaultDbOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * Created by caoqingyuan on 2016/11/24.
 */
public class ServiceTest {
    //修改组成员监控类型
    public static void update1(Connection conn) throws Exception {
//        Connection conn =null;
        try {
//            conn = AppUtil.createSelfMysqlConn().getM_Connection();
            String sql = "update t_main set name='xiaohong',age='18',detail='事务的测试',enable='Y' where id=1";
            DefaultDbOperation<MainPojo> defaultDbOperation = new DefaultDbOperation<MainPojo>(conn, MainPojo.class);
            int rows = defaultDbOperation.update(sql);
            conn.commit();
        }catch (Exception e){
            if(conn!=null){
                conn.rollback();
            }
            throw e;
        }finally {
//            if(conn!=null){
//                conn.close();
//            }
        }
    }
    //
    public static List<MainPojo> select1(Connection conn,int num,Integer id) throws Exception {
        List<MainPojo> list=null;
        try {
//            conn = AppUtil.createSelfMysqlConn().getM_Connection();
            String sql =null;
            if(num==1){
                sql = "select * from t_main where id="+id;
            }else{
                sql = "select * from t_main";
            }
            DefaultDbOperation<MainPojo> defaultDbOperation = new DefaultDbOperation<MainPojo>(conn, MainPojo.class);
            list = defaultDbOperation.executeQuery(sql,MainPojo.class);
            return list;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
    public static void reflush(Connection conn) throws Exception {
        PreparedStatement pre = null;
        try {
            String sql = "RESET QUERY CACHE";
            pre = conn.prepareStatement(sql);
            pre.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (pre != null) {
                pre.close();
            }
        }
    }
}
