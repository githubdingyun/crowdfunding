package com.dingyun.service.impl;

import com.dingyun.dao.ProADAO;
import com.dingyun.model.ProA;
import com.dingyun.model.ProAExample;
import com.dingyun.service.ProAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProAServiceImpl implements ProAService {
    @Autowired
    ProADAO proADAO;
    @Override
    public long countByExample(ProAExample example) {
        return proADAO.countByExample(example);
    }

    @Override
    public int deleteByExample(ProAExample example) {
        return proADAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return proADAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProA record) {
        return proADAO.insert(record);
    }

    @Override
    public int insertSelective(ProA record) {
        return proADAO.insertSelective(record);
    }

    @Override
    public List<ProA> selectByExample(ProAExample example) {
        return proADAO.selectByExample(example);
    }

    @Override
    public ProA selectByPrimaryKey(Integer id) {
        return proADAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ProA record, ProAExample example) {
        return proADAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ProA record, ProAExample example) {
        return proADAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ProA record) {
        return proADAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProA record) {
        return proADAO.updateByPrimaryKey(record);
    }
}
