package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.User;
import com.dingyun.model.UserExample;
import org.springframework.stereotype.Repository;

/**
 * UserService继承基类
 */
@Repository
public interface UserService extends MyBatisBaseDao<User, Integer, UserExample> {
}