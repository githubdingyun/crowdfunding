package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.ProA;
import com.dingyun.model.ProAExample;
import org.springframework.stereotype.Repository;

/**
 * ProAService继承基类
 */
@Repository
public interface ProAService extends MyBatisBaseDao<ProA, Integer, ProAExample> {
}