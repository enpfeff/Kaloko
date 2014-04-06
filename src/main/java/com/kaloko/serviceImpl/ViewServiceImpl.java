package com.kaloko.serviceImpl;

import com.googlecode.genericdao.search.Search;
import com.kaloko.dao.DaoView;
import com.kaloko.model.View;
import com.kaloko.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by enpfeff on 3/31/14.
 */

@Service
public class ViewServiceImpl implements ViewService {

    @Autowired
    private DaoView daoView;

    @Override
    public View getViewByPageName(String pageName) {
        List<View> views;

        views = daoView.getViewByPageName(pageName);

        if((!views.isEmpty() || views != null) && views.size() == 1) {
            return views.get(0);
        }
        return null;
    }

    @Override
    public List<String> getMenuTitles(View view) {
        String titles = view.getMenuTitles();
        return Arrays.asList(titles.split(","));
    }


}
