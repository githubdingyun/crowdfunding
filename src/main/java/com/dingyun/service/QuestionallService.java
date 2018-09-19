package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Questionall;
import com.dingyun.model.QuestionallExample;
import org.springframework.stereotype.Repository;

/**
 * QuestionallService继承基类
 */
@Repository
public interface QuestionallService extends MyBatisBaseDao<Questionall, Integer, QuestionallExample> {
}