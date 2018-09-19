package com.dingyun.service.impl;

import com.dingyun.dao.UserDAO;
import com.dingyun.model.User;
import com.dingyun.model.UserExample;
import com.dingyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;
    @Override
    public long countByExample(UserExample example) {
        return userDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return userDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userDAO.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userDAO.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return userDAO.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return userDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return userDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userDAO.updateByPrimaryKey(record);
    }
}
