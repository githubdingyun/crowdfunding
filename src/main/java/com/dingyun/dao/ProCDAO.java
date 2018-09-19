package com.dingyun.dao;

import com.dingyun.model.ProC;
import com.dingyun.model.ProCExample;
import org.springframework.stereotype.Repository;

/**
 * ProCDAO继承基类
 */
@Repository
public interface ProCDAO extends MyBatisBaseDao<ProC, Integer, ProCExample> {
}