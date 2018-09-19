package com.dingyun.dao;

import com.dingyun.model.ProA;
import com.dingyun.model.ProAExample;
import org.springframework.stereotype.Repository;

/**
 * ProADAO继承基类
 */
@Repository
public interface ProADAO extends MyBatisBaseDao<ProA, Integer, ProAExample> {
}