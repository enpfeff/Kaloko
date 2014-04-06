package com.kaloko.dao;

import com.kaloko.model.User;

import java.util.List;

/**
 * Created by enpfeff on 3/15/14.
 */
public interface DaoUser extends GenericDao<User> {
    public List<User> getAllUsers();
}
