package com.wolfcode.service.impl;

import com.wolfcode.dao.logDao;
import com.wolfcode.entity.T_log;
import com.wolfcode.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    logDao logmapper;
    @Override
    public void addLog(T_log t_log) {
         logmapper.insert(t_log);
    }
}
