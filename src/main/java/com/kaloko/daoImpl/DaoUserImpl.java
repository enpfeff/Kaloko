package com.kaloko.daoImpl;

import com.kaloko.dao.DaoUser;
import com.kaloko.dao.GenericDao;
import com.kaloko.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by enpfeff on 3/15/14.
 */
@Repository
public class DaoUserImpl extends GenericDaoImpl<User> implements DaoUser {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<User> ret = session.createQuery("from User").list();
        tx.commit();
        return ret;
    }
}
