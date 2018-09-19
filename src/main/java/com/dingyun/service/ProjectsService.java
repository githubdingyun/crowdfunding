package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Projects;
import com.dingyun.model.ProjectsExample;
import org.springframework.stereotype.Repository;

/**
 * ProjectsService继承基类
 */
@Repository
public interface ProjectsService extends MyBatisBaseDao<Projects, Integer, ProjectsExample> {
}