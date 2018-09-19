package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Funding;
import com.dingyun.model.FundingExample;
import org.springframework.stereotype.Repository;

/**
 * FundingService继承基类
 */
@Repository
public interface FundingService extends MyBatisBaseDao<Funding, Integer, FundingExample> {
}