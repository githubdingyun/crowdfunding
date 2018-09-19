package com.dingyun.dao;

import com.dingyun.model.Logs;
import com.dingyun.model.LogsExample;
import org.springframework.stereotype.Repository;

/**
 * LogsDAO继承基类
 */
@Repository
public interface LogsDAO extends MyBatisBaseDao<Logs, Integer, LogsExample> {
}