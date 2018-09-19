package com.dingyun.dao;

import com.dingyun.model.User;
import com.dingyun.model.UserExample;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Repository
public interface UserDAO extends MyBatisBaseDao<User, Integer, UserExample> {
}