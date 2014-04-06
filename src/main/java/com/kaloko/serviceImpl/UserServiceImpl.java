package com.kaloko.serviceImpl;

import com.kaloko.dao.DaoUser;
import com.kaloko.model.User;
import com.kaloko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by enpfeff on 3/15/14.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DaoUser daoUser;

    @Override
    @Transactional
    public void addUser(User user) {
        if (user.getLastLogin() == null) {
            user.setLastLogin(new Timestamp(new Date().getTime()));
        }
        daoUser.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return daoUser.getAllUsers();
    }

    @Override
    public void deleteUser(User user) {
        daoUser.delete(user);
    }
}
