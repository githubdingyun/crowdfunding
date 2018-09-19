package com.dingyun.service.impl;

import com.dingyun.dao.AdminDAO;
import com.dingyun.model.Admin;
import com.dingyun.model.AdminExample;
import com.dingyun.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class q20 implements AdminService {
    @Autowired
    AdminDAO adminDAO;
    @Override
    public long countByExample(AdminExample example) {
        return adminDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(AdminExample example) {
        return adminDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adminDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Admin record) {
        return adminDAO.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return adminDAO.insertSelective(record);
    }

    @Override
    public List<Admin> selectByExample(AdminExample example) {
        return adminDAO.selectByExample(example);
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return adminDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Admin record, AdminExample example) {
        return adminDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Admin record, AdminExample example) {
        return adminDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return adminDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminDAO.updateByPrimaryKey(record);
    }
}
