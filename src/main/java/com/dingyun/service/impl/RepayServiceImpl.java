package com.dingyun.service.impl;

import com.dingyun.dao.RepayDAO;
import com.dingyun.model.Repay;
import com.dingyun.model.RepayExample;
import com.dingyun.service.RepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepayServiceImpl implements RepayService {
    @Autowired
    RepayDAO repayDAO;
    @Override
    public long countByExample(RepayExample example) {
        return repayDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(RepayExample example) {
        return repayDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return repayDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Repay record) {
        return repayDAO.insert(record);
    }

    @Override
    public int insertSelective(Repay record) {
        return repayDAO.insertSelective(record);
    }

    @Override
    public List<Repay> selectByExample(RepayExample example) {
        return repayDAO.selectByExample(example);
    }

    @Override
    public Repay selectByPrimaryKey(Integer id) {
        return repayDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Repay record, RepayExample example) {
        return repayDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Repay record, RepayExample example) {
        return repayDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Repay record) {
        return repayDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Repay record) {
        return repayDAO.updateByPrimaryKey(record);
    }
}
