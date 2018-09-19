package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Logs;
import com.dingyun.model.LogsExample;
import org.springframework.stereotype.Repository;

/**
 * LogsService继承基类
 */
@Repository
public interface LogsService extends MyBatisBaseDao<Logs, Integer, LogsExample> {
}