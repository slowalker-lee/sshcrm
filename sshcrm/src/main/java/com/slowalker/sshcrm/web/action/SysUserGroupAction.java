package com.slowalker.sshcrm.web.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.slowalker.sshcrm.entity.SysUserGroup;
import com.slowalker.sshcrm.service.ISysUserGroupService;

public class SysUserGroupAction extends ActionSupport implements ModelDriven<SysUserGroup>{

	SysUserGroup sysUserGroup = new SysUserGroup();
	@Override
	public SysUserGroup getModel() {
		return sysUserGroup;
	}
	
	@Resource(name=ISysUserGroupService.service)
	private ISysUserGroupService sysUserGroupService;
	
	public void setSysUserGroupService(ISysUserGroupService sysUserGroupService) {
		this.sysUserGroupService = sysUserGroupService;
	}
	
	public String save() {
		sysUserGroupService.save(sysUserGroup);
		return "success";
	}
}
