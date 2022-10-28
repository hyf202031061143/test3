package com.wolfcode.service.impl;

import com.wolfcode.dao.priDao;
import com.wolfcode.dao.userDao;
import com.wolfcode.entity.T_User;
import com.wolfcode.entity.T_privilage;
import com.wolfcode.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class userServiceImpl implements userService{
    //引入dao层
@Autowired
    userDao userMapper;
    @Autowired
    priDao priMapper ;
    @Override
    public int getUserCount() {
        return userMapper.select();
    }

    @Override
    public T_User getuser(String acount) {
        return userMapper.selectUserByConditon(acount);
    }
    @Override
    public int updateUser(String ucode, Short ustatus) {
        Map<String,Object> paramMap=new HashMap<>() ;
        paramMap.put("ucode",ucode);
        paramMap.put("ustatus",ustatus) ;
        return userMapper.updateUser(paramMap);
    }
    @Override
    public int userUpdate(String ucode, String uname){
//    {, int usex, Date ubirthday, String uphone, String uaddress)
        Map<String,Object> paramMap=new HashMap<>() ;
        paramMap.put("ucode",ucode);
        paramMap.put("uname",uname);
//        paramMap.put("usex",usex);
//        paramMap.put("ubirthday",ubirthday);
//        paramMap.put("uphone",uphone);
//        paramMap.put("uaddress",uaddress);
        return userMapper.userUpdate(paramMap);
    }
    public int userUpdate1(String ucode, String uaddress){
//    {, int usex, Date ubirthday, String uphone, String uaddress)
        Map<String,Object> paramMap=new HashMap<>() ;
        paramMap.put("ucode",ucode);
        paramMap.put("uaddress",uaddress);
//        paramMap.put("usex",usex);
//        paramMap.put("ubirthday",ubirthday);
//        paramMap.put("uphone",uphone);
//        paramMap.put("uaddress",uaddress);
        return userMapper.userUpdate1(paramMap);
    }
    @Override
    public int userUpdatesex(String ucode, int usex){

        Map<String,Object> paramMap=new HashMap<>() ;
        paramMap.put("ucode",ucode);
        paramMap.put("usex",usex);
        return userMapper.userUpdatesex(paramMap);
    }
    @Override
    public int userUpdatephone(String ucode, String uphone){

        Map<String,Object> paramMap=new HashMap<>() ;
        paramMap.put("ucode",ucode);
        paramMap.put("uphone",uphone);
        return userMapper.userUpdatephone(paramMap);
    }
    @Override
    public int userDelete(String ucode)
    {
        return userMapper.userDelete(ucode);
    }
    @Override
    public int userAdd(String ucode)
    {
        return  userMapper.userAdd(ucode);
    }
    @Override
    public List<T_privilage> getUserPri(Integer rid) {
        //怎么一下把模块/按钮权限全部查询?
        //要求-模块包含按钮权限
        //首先查询该用户的模块权限
        List<T_privilage> t_priviages = priMapper.selectPriviage(rid);
        System.out.println(rid+"--查询到的父级权限--"+t_priviages);
        //根据模块级权限id查询按钮权限
        for (T_privilage tmp:t_priviages){
            Map<String,Object> paramMap=new HashMap<>() ;
            paramMap.put("pid",tmp.getPid());
            paramMap.put("rid",rid);
            List<T_privilage> sonPriList = priMapper.selectSonPriviage(paramMap);
            tmp.setPriList(sonPriList);
        }
        return t_priviages;
    }

}
