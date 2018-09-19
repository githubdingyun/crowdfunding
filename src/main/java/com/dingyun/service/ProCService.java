package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.ProC;
import com.dingyun.model.ProCExample;
import org.springframework.stereotype.Repository;

/**
 * ProCService继承基类
 */
@Repository
public interface ProCService extends MyBatisBaseDao<ProC, Integer, ProCExample> {
}