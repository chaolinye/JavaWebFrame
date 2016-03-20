package scut.inventor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import scut.inventor.dao.BaseDao;
import scut.inventor.entity.User;
import scut.inventor.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private BaseDao<User> baseDao;
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		baseDao.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		baseDao.update(user);
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return baseDao.get(User.class, id);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		baseDao.delete(user);
	}

	@Override
	public List<User> findAllList() {
		// TODO Auto-generated method stub
		String hql="from User";
		return baseDao.find(hql);
	}

	@Override
	public User findUserByNameAndPassword(User user) {
		// TODO Auto-generated method stub
		String hql="from User u where u.userName=? and u.password=?";
		return baseDao.get(hql, new Object[]{user.getUserName(),user.getPassword()});
	}

}
