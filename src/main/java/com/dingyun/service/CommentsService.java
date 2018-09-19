package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Comments;
import com.dingyun.model.CommentsExample;
import org.springframework.stereotype.Repository;

/**
 * CommentsService继承基类
 */
@Repository
public interface CommentsService extends MyBatisBaseDao<Comments, Integer, CommentsExample> {
}