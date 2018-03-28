package com.slowalker.sshcrm.service;

import com.slowalker.sshcrm.dao.ISysUserGroupDao;
import com.slowalker.sshcrm.entity.SysUserGroup;

public interface ISysUserGroupService {
	String service = "com.slowalker.sshcrm.service.impl.SysUserGroupServiceImpl";
	
	public void save(SysUserGroup entity);
}
