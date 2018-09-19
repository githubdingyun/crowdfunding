package com.dingyun.dao;

import com.dingyun.model.Projects;
import com.dingyun.model.ProjectsExample;
import org.springframework.stereotype.Repository;

/**
 * ProjectsDAO继承基类
 */
@Repository
public interface ProjectsDAO extends MyBatisBaseDao<Projects, Integer, ProjectsExample> {
}