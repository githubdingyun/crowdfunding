package com.dingyun.dao;

import com.dingyun.model.Letter;
import com.dingyun.model.LetterExample;
import org.springframework.stereotype.Repository;

/**
 * LetterDAO继承基类
 */
@Repository
public interface LetterDAO extends MyBatisBaseDao<Letter, Integer, LetterExample> {
}