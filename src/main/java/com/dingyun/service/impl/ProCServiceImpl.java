package com.dingyun.service.impl;

import com.dingyun.dao.ProCDAO;
import com.dingyun.model.ProC;
import com.dingyun.model.ProCExample;
import com.dingyun.service.ProCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProCServiceImpl implements ProCService {
    @Autowired
    ProCDAO proCDAO;
    @Override
    public long countByExample(ProCExample example) {
        return proCDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(ProCExample example) {
        return proCDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return proCDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProC record) {
        return proCDAO.insert(record);
    }

    @Override
    public int insertSelective(ProC record) {
        return proCDAO.insertSelective(record);
    }

    @Override
    public List<ProC> selectByExample(ProCExample example) {
        return proCDAO.selectByExample(example);
    }

    @Override
    public ProC selectByPrimaryKey(Integer id) {
        return proCDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ProC record, ProCExample example) {
        return proCDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ProC record, ProCExample example) {
        return proCDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ProC record) {
        return proCDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProC record) {
        return proCDAO.updateByPrimaryKey(record);
    }
}
