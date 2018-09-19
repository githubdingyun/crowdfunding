package com.dingyun.dao;

import com.dingyun.model.ProB;
import com.dingyun.model.ProBExample;
import org.springframework.stereotype.Repository;

/**
 * ProBDAO继承基类
 */
@Repository
public interface ProBDAO extends MyBatisBaseDao<ProB, Integer, ProBExample> {
}