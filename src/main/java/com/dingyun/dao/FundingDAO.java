package com.dingyun.dao;

import com.dingyun.model.Funding;
import com.dingyun.model.FundingExample;
import org.springframework.stereotype.Repository;

/**
 * FundingDAO继承基类
 */
@Repository
public interface FundingDAO extends MyBatisBaseDao<Funding, Integer, FundingExample> {
}