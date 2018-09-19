package com.dingyun.service.impl;

import com.dingyun.dao.ProjectstypeDAO;
import com.dingyun.model.Projectstype;
import com.dingyun.model.ProjectstypeExample;
import com.dingyun.service.ProjectstypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectstypeServiceImpl implements ProjectstypeService {
    @Autowired
    ProjectstypeDAO projectstypeDAO;
    @Override
    public long countByExample(ProjectstypeExample example) {
        return projectstypeDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(ProjectstypeExample example) {
        return projectstypeDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return projectstypeDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Projectstype record) {
        return projectstypeDAO.insert(record);
    }

    @Override
    public int insertSelective(Projectstype record) {
        return projectstypeDAO.insertSelective(record);
    }

    @Override
    public List<Projectstype> selectByExample(ProjectstypeExample example) {
        return projectstypeDAO.selectByExample(example);
    }

    @Override
    public Projectstype selectByPrimaryKey(Integer id) {
        return projectstypeDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Projectstype record, ProjectstypeExample example) {
        return projectstypeDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Projectstype record, ProjectstypeExample example) {
        return projectstypeDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Projectstype record) {
        return projectstypeDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Projectstype record) {
        return projectstypeDAO.updateByPrimaryKey(record);
    }
}
