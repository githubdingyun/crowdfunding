package com.dingyun.service.impl;

import com.dingyun.dao.FundingDAO;
import com.dingyun.model.Funding;
import com.dingyun.model.FundingExample;
import com.dingyun.service.FundingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundingServiceImpl implements FundingService {
    @Autowired
    FundingDAO fundingDAO;
    @Override
    public long countByExample(FundingExample example) {
        return fundingDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(FundingExample example) {
        return fundingDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return fundingDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Funding record) {
        return fundingDAO.insert(record);
    }

    @Override
    public int insertSelective(Funding record) {
        return fundingDAO.insertSelective(record);
    }

    @Override
    public List<Funding> selectByExample(FundingExample example) {
        return fundingDAO.selectByExample(example);
    }

    @Override
    public Funding selectByPrimaryKey(Integer id) {
        return fundingDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Funding record, FundingExample example) {
        return fundingDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Funding record, FundingExample example) {
        return fundingDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Funding record) {
        return fundingDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Funding record) {
        return fundingDAO.updateByPrimaryKey(record);
    }
}
