package com.dingyun.dao;

import com.dingyun.model.Questionall;
import com.dingyun.model.QuestionallExample;
import org.springframework.stereotype.Repository;

/**
 * QuestionallDAO继承基类
 */
@Repository
public interface QuestionallDAO extends MyBatisBaseDao<Questionall, Integer, QuestionallExample> {
}