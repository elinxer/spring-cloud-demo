package com.zhiteer.demo.demouser.service;

import com.zhiteer.demo.demouser.dao.MyUserDao;
import com.zhiteer.demo.demouser.dao.MyUserMapper;
import com.zhiteer.demo.demouser.model.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDaoServiceImpl implements MyUserDaoService {

	@Autowired
	private MyUserDao myUserDao;

	@Override
	public MyUser selectUserById(Integer key) throws Exception {
		return myUserDao.selectUserById(key);
	}

	@Override
	public List<MyUser> selectAllUser() throws Exception {
		return myUserDao.selectAllUser();
	}

	@Override
	public int addUser(MyUser record) throws Exception {
		return myUserDao.addUser(record);
	}

	@Override
	public int updateUser(MyUser record) throws Exception {
		return myUserDao.updateUser(record);
	}

	@Override
	public int deleteUser(Integer id) throws Exception {
		return myUserDao.deleteUser(id);
	}

}
