package com.slowalker.sshcrm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.slowalker.sshcrm.dao.ISysUserGroupDao;
import com.slowalker.sshcrm.entity.SysUserGroup;
import com.slowalker.sshcrm.service.ISysUserGroupService;

@Service(value=ISysUserGroupService.service)
@Transactional(isolation=Isolation.DEFAULT, readOnly=true, propagation=Propagation.REQUIRED)
public class SysUserGroupServiceImpl implements ISysUserGroupService{
	
	@Resource(name=ISysUserGroupDao.DAOIMPL)
	private ISysUserGroupDao sysUserGroupdao;

	public void setSysUserGroupdao(ISysUserGroupDao sysUserGroupdao) {
		this.sysUserGroupdao = sysUserGroupdao;
	}

	@Override
	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED, readOnly=false)
	public void save(SysUserGroup entity) {
		sysUserGroupdao.save(entity);
		
	}
	
}
