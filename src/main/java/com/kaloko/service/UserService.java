package com.kaloko.service;

import com.kaloko.model.User;

import java.util.List;

/**
 * Created by enpfeff on 3/15/14.
 */
public interface UserService {
    public void addUser(User user);
    public List<User> getAllUsers();
    public void deleteUser(User user);
}
