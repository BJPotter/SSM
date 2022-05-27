package com.root.service;

import com.root.entity.User;

/**
 * <p>
 * 接口
 * </p>
 *
 * @author liuzhi
 * @Since 2022/05/27  11:23
 */
public interface UserService {
    public User selectById(String username);
}
