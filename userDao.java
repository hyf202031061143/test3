package com.wolfcode.dao;

import com.wolfcode.entity.T_User;

import java.util.Map;

public interface userDao {
     //测试
     int select();

     //查询用户信息
     T_User selectUserByConditon(String str);
     /**
      * 根据用户的ucode更新用户状态
      * String ucode,Short ustatus
      * @param paramMap
      */
     int updateUser(Map<String,Object> paramMap ) ;
     int userUpdate(Map<String,Object> paramMap ) ;

     int userUpdate1(Map<String,Object> paramMap );
     int userUpdatesex(Map<String,Object> paramMap );
     int userUpdatephone(Map<String,Object> paramMap );

     int userDelete(String ucode);

     int userAdd(String ucode);

}
