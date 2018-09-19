package com.dingyun.service.impl;

import com.dingyun.dao.QuestionallDAO;
import com.dingyun.model.Questionall;
import com.dingyun.model.QuestionallExample;
import com.dingyun.service.QuestionallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionallServiceImpl implements QuestionallService {
    @Autowired
    QuestionallDAO questionallDAO;
    @Override
    public long countByExample(QuestionallExample example) {
        return questionallDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(QuestionallExample example) {
        return questionallDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return questionallDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Questionall record) {
        return questionallDAO.insert(record);
    }

    @Override
    public int insertSelective(Questionall record) {
        return questionallDAO.insertSelective(record);
    }

    @Override
    public List<Questionall> selectByExample(QuestionallExample example) {
        return questionallDAO.selectByExample(example);
    }

    @Override
    public Questionall selectByPrimaryKey(Integer id) {
        return questionallDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Questionall record, QuestionallExample example) {
        return questionallDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Questionall record, QuestionallExample example) {
        return questionallDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Questionall record) {
        return questionallDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Questionall record) {
        return questionallDAO.updateByPrimaryKey(record);
    }
}
