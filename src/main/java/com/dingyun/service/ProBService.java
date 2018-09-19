package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.ProB;
import com.dingyun.model.ProBExample;
import org.springframework.stereotype.Repository;

/**
 * ProBService继承基类
 */
@Repository
public interface ProBService extends MyBatisBaseDao<ProB, Integer, ProBExample> {
}