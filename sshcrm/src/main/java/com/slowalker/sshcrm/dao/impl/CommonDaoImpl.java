package com.slowalker.sshcrm.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.slowalker.sshcrm.dao.ICommonDao;
@Repository
public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDao<T> {

	@Resource(name="sessionFactory")
	public void setSessionFactoryDi(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	} 
	
	@Override
	public void save(Object entity) {
		this.getHibernateTemplate().save(entity);
		
	}

}
