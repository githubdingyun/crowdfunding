package com.dingyun.service.impl;

import com.dingyun.dao.ProBDAO;
import com.dingyun.model.ProB;
import com.dingyun.model.ProBExample;
import com.dingyun.service.ProBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProBServiceImpl implements ProBService {
    @Autowired
    ProBDAO proBDAO;
    @Override
    public long countByExample(ProBExample example) {
        return proBDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(ProBExample example) {
        return proBDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return proBDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProB record) {
        return proBDAO.insert(record);
    }

    @Override
    public int insertSelective(ProB record) {
        return proBDAO.insertSelective(record);
    }

    @Override
    public List<ProB> selectByExample(ProBExample example) {
        return proBDAO.selectByExample(example);
    }

    @Override
    public ProB selectByPrimaryKey(Integer id) {
        return proBDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ProB record, ProBExample example) {
        return proBDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ProB record, ProBExample example) {
        return proBDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ProB record) {
        return proBDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProB record) {
        return proBDAO.updateByPrimaryKey(record);
    }
}
