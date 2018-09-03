package com.levelksk.spring.boot.blog.repository;

import com.levelksk.spring.boot.blog.domain.User;

import java.util.List;

public interface UserRepository {
    /**
     * 新增或者修复用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取所有用户的列表
     * @return
     */
    List<User> listUser();
}
