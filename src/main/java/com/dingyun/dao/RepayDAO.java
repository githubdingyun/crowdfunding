package com.dingyun.dao;

import com.dingyun.model.Repay;
import com.dingyun.model.RepayExample;
import org.springframework.stereotype.Repository;

/**
 * RepayDAO继承基类
 */
@Repository
public interface RepayDAO extends MyBatisBaseDao<Repay, Integer, RepayExample> {
}