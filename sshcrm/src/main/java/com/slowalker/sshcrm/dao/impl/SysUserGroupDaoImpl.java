package com.slowalker.sshcrm.dao.impl;

import org.springframework.stereotype.Repository;

import com.slowalker.sshcrm.dao.ISysUserGroupDao;
import com.slowalker.sshcrm.entity.SysUserGroup;

@Repository(value=ISysUserGroupDao.DAOIMPL)
public class SysUserGroupDaoImpl extends CommonDaoImpl<SysUserGroup> implements ISysUserGroupDao{

}
