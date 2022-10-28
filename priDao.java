package com.wolfcode.dao;

import com.wolfcode.entity.T_privilage;

import java.util.List;
import java.util.Map;

public interface priDao {
    List<T_privilage> selectPriviage(Integer rid) ;

    List<T_privilage> selectSonPriviage(Map<String,Object> paramMap) ;
}
