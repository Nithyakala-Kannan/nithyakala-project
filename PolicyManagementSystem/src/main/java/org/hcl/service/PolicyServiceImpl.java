package org.hcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hcl.dao.PolicyDao;
import org.hcl.entities.Admin;
import org.hcl.entities.Policy;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class PolicyServiceImpl implements PolicyService{
	 @Autowired
     PolicyDao dao;
	@Override
	public boolean insert(Policy policy) {
		// TODO Auto-generated method stub
		dao.insert(policy);
		return true;
	}

	@Override
	public void show(User user) {
		// TODO Auto-generated method stub
		dao.show(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List<User> userlist=dao.getUsers();
		return userlist;
	}

	@Override
	public List<Admin> getAdminDetails() {
		// TODO Auto-generated method stub
		List<Admin> admin =dao.getAdminDetails();
        return admin;
	}

	@Override
	public List<Policy> getPolicies() {
		// TODO Auto-generated method stub
		List<Policy> policy=dao.getPolicies();
		return policy;
	}

	@Override
	public void savePolicy(Policy policy) {
		// TODO Auto-generated method stub
		dao.savePolicy(policy);
	}

	@Override
	public Policy getById(Integer pid) {
		// TODO Auto-generated method stub
		Policy policy =dao.getById(pid);
        return policy;
	}

	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.saveAdmin(admin);
	}

	@Override
	public void updatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		dao.updatePolicy(policy);
		
	}

	@Override
	public void deletePolicy(Integer pid) {
		// TODO Auto-generated method stub
		dao.deletePolicy(pid);
		
	}

}
