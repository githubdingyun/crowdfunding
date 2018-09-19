package com.dingyun.service.impl;

import com.dingyun.dao.LogsDAO;
import com.dingyun.model.Logs;
import com.dingyun.model.LogsExample;
import com.dingyun.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogsServiceImpl implements LogsService {
    @Autowired
    LogsDAO logsDAO;
    @Override
    public long countByExample(LogsExample example) {
        return logsDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(LogsExample example) {
        return logsDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return logsDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Logs record) {
        return logsDAO.insert(record);
    }

    @Override
    public int insertSelective(Logs record) {
        return logsDAO.insertSelective(record);
    }

    @Override
    public List<Logs> selectByExample(LogsExample example) {
        return logsDAO.selectByExample(example);
    }

    @Override
    public Logs selectByPrimaryKey(Integer id) {
        return logsDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Logs record, LogsExample example) {
        return logsDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Logs record, LogsExample example) {
        return logsDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Logs record) {
        return logsDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Logs record) {
        return logsDAO.updateByPrimaryKey(record);
    }
}
