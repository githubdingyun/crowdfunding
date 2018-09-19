package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Admin;
import com.dingyun.model.AdminExample;
import org.springframework.stereotype.Repository;

/**
 * AdminService继承基类
 */
@Repository
public interface AdminService extends MyBatisBaseDao<Admin, Integer, AdminExample> {
}