package com.dingyun.service.impl;

import com.dingyun.dao.CommentsDAO;
import com.dingyun.model.Comments;
import com.dingyun.model.CommentsExample;
import com.dingyun.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    CommentsDAO commentsDao;
    @Override
    public long countByExample(CommentsExample example) {
        return commentsDao.countByExample(example);
    }

    @Override
    public int deleteByExample(CommentsExample example) {
        return commentsDao.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return commentsDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Comments record) {
        return commentsDao.insert(record);
    }

    @Override
    public int insertSelective(Comments record) {
        return commentsDao.insertSelective(record);
    }

    @Override
    public List<Comments> selectByExample(CommentsExample example) {
        return commentsDao.selectByExample(example);
    }

    @Override
    public Comments selectByPrimaryKey(Integer id) {
        return commentsDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Comments record, CommentsExample example) {
        return commentsDao.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Comments record, CommentsExample example) {
        return commentsDao.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Comments record) {
        return commentsDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Comments record) {
        return commentsDao.updateByPrimaryKey(record);
    }
}
