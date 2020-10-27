package org.hcl.dao;

import org.hcl.entities.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	SessionFactory factory;

	public void insert(Admin admin) {
		Session session=factory.openSession();
		int value=(Integer) session.save(admin);

}
	
	
}
