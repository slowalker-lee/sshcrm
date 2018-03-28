package com.slowalker.sshcrm.entity;

/**
 * 部门类
 * @author slowalker
 *
 */
public class SysUserGroup {
	private Integer id;			//主键
	private String remark;		//备注
	private String principal;	//负责人
	private String name;		//名称
	private String incumbent;	//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIncumbent() {
		return incumbent;
	}
	public void setIncumbent(String incumbent) {
		this.incumbent = incumbent;
	}
	
	
	
	
	
	
}
