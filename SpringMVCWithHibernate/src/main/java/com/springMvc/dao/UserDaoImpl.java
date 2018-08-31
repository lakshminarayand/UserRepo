package com.springMvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springMvc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<User> geListOfUsers() {
		Criteria criteria = getSession().createCriteria(User.class);
		
		return (List<User>)criteria.list();
	}

	public void saveOrUpdate(User user) {
		getSession().saveOrUpdate(user);
	}

	public void delete(User user) {
		getSession().delete(user);
	}

	public User findUserById(int id) {
		return (User) getSession().get(User.class, id);
	}
	
	public int findUser(String username, String password) {
		Criteria criteria = getSession().createCriteria(User.class)
				.add(Restrictions.eq("username", username))
				.add(Restrictions.and(
				     Restrictions.eq("password", password)));
		int l =criteria.list().size();
		
		return l;
	}

}
