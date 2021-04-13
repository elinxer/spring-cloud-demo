package com.zhiteer.demo.demouser.dao;

import com.zhiteer.demo.demouser.model.MyUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyUserDao {

    MyUser selectUserById(Integer key);

    List<MyUser> selectAllUser();

    int addUser(MyUser record);

    int updateUser(MyUser record);

    int deleteUser(Integer key);

    int updateUserDemo(MyUser record);

}