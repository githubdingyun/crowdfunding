package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Questionother;
import com.dingyun.model.QuestionotherExample;
import org.springframework.stereotype.Repository;

/**
 * QuestionotherService继承基类
 */
@Repository
public interface QuestionotherService extends MyBatisBaseDao<Questionother, Integer, QuestionotherExample> {
}