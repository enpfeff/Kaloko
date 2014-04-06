package com.kaloko.daoImpl;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.kaloko.dao.DaoView;
import com.kaloko.dao.GenericDao;
import com.kaloko.model.User;
import com.kaloko.model.View;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by enpfeff on 3/31/14.
 */

@Repository
public class DaoViewImpl extends GenericDaoImpl<View> implements DaoView {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<View> getViewByPageName(String pageName) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from View WHERE pageName = :pageName ");
        query.setParameter("pageName", pageName);
        List<View> ret = query.list();
        tx.commit();
        return ret;
    }
}
