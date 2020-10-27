package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Admin;
import org.hcl.entities.Policy;
import org.hcl.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PolicyDaoImpl implements PolicyDao {
    @Autowired
    SessionFactory factory;
	@Override
	public boolean insert(Policy policy) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		int id=(Integer) session.save(policy);
		return true;
	}

	@Override
	public void show(User user) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().save(user);	

	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		Query query=factory.getCurrentSession().createQuery("from User user");
	      List<User> list=query.list();
			return list;
	}

	@Override
	public List<Admin> getAdminDetails() {
		// TODO Auto-generated method stub
		Query query =factory.getCurrentSession().createQuery("from Admin admin");
        @SuppressWarnings("unchecked")
        List<Admin> adminList = query.list();
        return adminList;
}


	@Override
	public List<Policy> getPolicies() {
		// TODO Auto-generated method stub
		Query query =factory.getCurrentSession().createQuery("from Policy p");
		List<Policy> policylist=query.list();
		return policylist;
	}

	@Override
	public void savePolicy(Policy policy) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().save(policy);
	}

	@Override
	public Policy getById(Integer pid) {
		// TODO Auto-generated method stub
		Policy policy =factory.getCurrentSession().get(Policy.class, pid);
		return policy;

	}

	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().save(admin);
	}

	@Override
	public void updatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().update(policy);

	}

	@Override
	public void deletePolicy(Integer pid) {
		// TODO Auto-generated method stub
		Query query = factory.getCurrentSession().createQuery("delete from Policy p where p.id=:pid");
        query.setParameter("pid", pid);
        query.executeUpdate();	

	}

}
