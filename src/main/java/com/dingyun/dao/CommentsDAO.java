package com.dingyun.dao;

import com.dingyun.model.Comments;
import com.dingyun.model.CommentsExample;
import org.springframework.stereotype.Repository;

/**
 * CommentsDAO继承基类
 */
@Repository
public interface CommentsDAO extends MyBatisBaseDao<Comments, Integer, CommentsExample> {
}