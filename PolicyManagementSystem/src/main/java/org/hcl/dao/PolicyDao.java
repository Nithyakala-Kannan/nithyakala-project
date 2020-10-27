package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Admin;
import org.hcl.entities.Policy;
import org.hcl.entities.User;


public interface PolicyDao {
	public boolean insert(Policy policy);
	void show(User user);
	
	List<User> getUsers();
	
	List<Admin> getAdminDetails();
	
	List<Policy> getPolicies();
	
	void savePolicy(Policy policy);

	Policy getById(Integer pid);

	void saveAdmin(Admin admin);

	void updatePolicy(Policy policy);

	void deletePolicy(Integer pid);

}
