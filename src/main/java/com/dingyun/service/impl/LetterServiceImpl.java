package com.dingyun.service.impl;

import com.dingyun.dao.LetterDAO;
import com.dingyun.model.Letter;
import com.dingyun.model.LetterExample;
import com.dingyun.service.LetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LetterServiceImpl implements LetterService {
    @Autowired
    LetterDAO letterDAO;
    @Override
    public long countByExample(LetterExample example) {
        return letterDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(LetterExample example) {
        return letterDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return letterDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Letter record) {
        return letterDAO.insert(record);
    }

    @Override
    public int insertSelective(Letter record) {
        return letterDAO.insertSelective(record);
    }

    @Override
    public List<Letter> selectByExample(LetterExample example) {
        return letterDAO.selectByExample(example);
    }

    @Override
    public Letter selectByPrimaryKey(Integer id) {
        return letterDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Letter record, LetterExample example) {
        return letterDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Letter record, LetterExample example) {
        return letterDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Letter record) {
        return letterDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Letter record) {
        return letterDAO.updateByPrimaryKey(record);
    }
}
