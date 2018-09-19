package com.dingyun.dao;

import com.dingyun.model.Admin;
import com.dingyun.model.AdminExample;
import org.springframework.stereotype.Repository;

/**
 * AdminDAO继承基类
 */
@Repository
public interface AdminDAO extends MyBatisBaseDao<Admin, Integer, AdminExample> {
}