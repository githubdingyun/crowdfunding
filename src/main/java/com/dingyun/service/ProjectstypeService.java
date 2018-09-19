package com.dingyun.service;

import com.dingyun.dao.MyBatisBaseDao;
import com.dingyun.model.Projectstype;
import com.dingyun.model.ProjectstypeExample;
import org.springframework.stereotype.Repository;

/**
 * ProjectstypeService继承基类
 */
@Repository
public interface ProjectstypeService extends MyBatisBaseDao<Projectstype, Integer, ProjectstypeExample> {
}