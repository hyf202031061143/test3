package com.wolfcode.service;

import com.wolfcode.entity.T_User;
import com.wolfcode.entity.T_privilage;

import java.sql.Date;
import java.util.List;

public interface userService {
    int getUserCount();

    /**
     * 根据账号查询用户
     * @param acount
     * @return
     */
    T_User getuser(String acount) ;

    /**
     * 更新用户状态
     * @param ucode
     * @param ustatus
     * @return
     */
    int updateUser(String ucode, Short ustatus) ;
    int userUpdate(String ucode,String uname);
//    , int usex, Date ubirthday,String uphone,String uaddress);
    /*
     *获取用户的权限信息
     */
int userUpdate1(String ucode,String uaddress);
    int userUpdatesex(String ucode,int usex);
    int userUpdatephone(String ucode,String uphone);




    int userDelete(String ucode);


    int userAdd(String ucode);
    List<T_privilage> getUserPri(Integer  rid) ;
}
