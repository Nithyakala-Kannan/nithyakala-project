package org.hcl.dao;
import java.util.List;

import org.hcl.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory factory;

	@Override
	public void insert(User user) {
		Session session=factory.openSession();
		int value=(Integer) session.save(user);
		
	}


		
	}
	
