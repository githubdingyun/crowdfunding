package com.dingyun.service.impl;

import com.dingyun.dao.ProjectsDAO;
import com.dingyun.model.Projects;
import com.dingyun.model.ProjectsExample;
import com.dingyun.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsServiceImpl implements ProjectsService {
    @Autowired
    ProjectsDAO projectsDAO;
    @Override
    public long countByExample(ProjectsExample example) {
        return projectsDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(ProjectsExample example) {
        return projectsDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return projectsDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Projects record) {
        return projectsDAO.insert(record);
    }

    @Override
    public int insertSelective(Projects record) {
        return projectsDAO.insertSelective(record);
    }

    @Override
    public List<Projects> selectByExample(ProjectsExample example) {
        return projectsDAO.selectByExample(example);
    }

    @Override
    public Projects selectByPrimaryKey(Integer id) {
        return projectsDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Projects record, ProjectsExample example) {
        return projectsDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Projects record, ProjectsExample example) {
        return projectsDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Projects record) {
        return projectsDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Projects record) {
        return projectsDAO.updateByPrimaryKey(record);
    }
}
