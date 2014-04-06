package com.kaloko.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.kaloko.model.View;

import java.util.List;

/**
 * Created by enpfeff on 3/31/14.
 */
public interface DaoView extends GenericDao<View> {
    public List<View> getViewByPageName(String pageName);
}
