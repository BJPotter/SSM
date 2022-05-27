package com.root.service.impl;

import com.root.dao.UserDao;
import com.root.entity.User;
import com.root.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 类
 * </p>
 *
 * @author liuzhi
 * @Since 2022/05/27  11:24
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    public User selectById(String username){
        return userDao.selectByPrimaryKey(username);
    }
}
