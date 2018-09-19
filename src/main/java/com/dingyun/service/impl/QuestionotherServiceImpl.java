package com.dingyun.service.impl;

import com.dingyun.dao.QuestionotherDAO;
import com.dingyun.model.Questionother;
import com.dingyun.model.QuestionotherExample;
import com.dingyun.service.QuestionotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionotherServiceImpl implements QuestionotherService {
    @Autowired
    QuestionotherDAO questionotherDAO;
    @Override
    public long countByExample(QuestionotherExample example) {
        return questionotherDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(QuestionotherExample example) {
        return questionotherDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return questionotherDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Questionother record) {
        return questionotherDAO.insert(record);
    }

    @Override
    public int insertSelective(Questionother record) {
        return questionotherDAO.insertSelective(record);
    }

    @Override
    public List<Questionother> selectByExample(QuestionotherExample example) {
        return questionotherDAO.selectByExample(example);
    }

    @Override
    public Questionother selectByPrimaryKey(Integer id) {
        return questionotherDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Questionother record, QuestionotherExample example) {
        return questionotherDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Questionother record, QuestionotherExample example) {
        return questionotherDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Questionother record) {
        return questionotherDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Questionother record) {
        return questionotherDAO.updateByPrimaryKey(record);
    }
}
