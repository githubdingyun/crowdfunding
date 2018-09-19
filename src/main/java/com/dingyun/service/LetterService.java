package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Letter;
import com.dingyun.model.LetterExample;
import org.springframework.stereotype.Repository;

/**
 * LetterService继承基类
 */
@Repository
public interface LetterService extends MyBatisBaseDao<Letter, Integer, LetterExample> {
}