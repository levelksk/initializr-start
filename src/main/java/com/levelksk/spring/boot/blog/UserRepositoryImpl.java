package com.levelksk.spring.boot.blog;

import com.levelksk.spring.boot.blog.domain.User;
import com.levelksk.spring.boot.blog.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

public class UserRepositoryImpl implements UserRepository {

    private static AtomicLong counter = new AtomicLong(); // 线程安全的Long

    private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<>(); // 线程安全的HsahMap

    @Override
    public User saveOrUpdateUser(User user) {
        Long id = user.getId();
        if (id == null) {
            id = counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> listUser() {
        return new ArrayList<User>(this.userMap.values());
    }
}
