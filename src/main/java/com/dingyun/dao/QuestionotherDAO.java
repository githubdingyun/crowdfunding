package com.dingyun.dao;

import com.dingyun.model.Questionother;
import com.dingyun.model.QuestionotherExample;
import org.springframework.stereotype.Repository;

/**
 * QuestionotherDAO继承基类
 */
@Repository
public interface QuestionotherDAO extends MyBatisBaseDao<Questionother, Integer, QuestionotherExample> {
}