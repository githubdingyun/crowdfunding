package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Repay;
import com.dingyun.model.RepayExample;
import org.springframework.stereotype.Repository;

/**
 * RepayService继承基类
 */
@Repository
public interface RepayService extends MyBatisBaseDao<Repay, Integer, RepayExample> {
}