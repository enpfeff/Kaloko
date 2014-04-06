package com.kaloko.dao;

import java.util.List;

/**
 * Created by enpfeff on 3/31/14.
 */
public interface GenericDao<T> {
    public void save(T t);
    public void delete(T t);
    public void update(T t);
}
