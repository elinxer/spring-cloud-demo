package com.zhiteer.demo.demouser.service;

import com.zhiteer.demo.demouser.model.MyUser;

import java.util.List;

/**
 * Dao接口，提供调用
 */
public interface MyUserDaoService {

	MyUser selectUserById(Integer key) throws Exception;

	List<MyUser> selectAllUser() throws Exception;

	int addUser(MyUser record) throws Exception;

	int updateUser(MyUser record) throws Exception;

	int deleteUser(Integer id) throws Exception;

	int updateUserDemo(MyUser record) throws Exception;

}
