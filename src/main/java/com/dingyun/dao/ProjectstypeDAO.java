package com.dingyun.dao;

import com.dingyun.model.Projectstype;
import com.dingyun.model.ProjectstypeExample;
import org.springframework.stereotype.Repository;

/**
 * ProjectstypeDAO继承基类
 */
@Repository
public interface ProjectstypeDAO extends MyBatisBaseDao<Projectstype, Integer, ProjectstypeExample> {
}