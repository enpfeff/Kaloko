package com.kaloko.daoImpl;

import com.kaloko.dao.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by enpfeff on 3/31/14.
 */
@Repository
public class GenericDaoImpl<T> implements GenericDao<T> {


    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> type;

    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    @Transactional
    @Override
    public void save(final T t) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(t);
        tx.commit();
    }

    @Override
    public void delete(final T t) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(t);
        tx.commit();
    }

    @Transactional
    @Override
    public void update(final T t) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(t);
        tx.commit();
    }
}
