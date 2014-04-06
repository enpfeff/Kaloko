package com.kaloko.service;

import com.kaloko.model.View;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by enpfeff on 3/31/14.
 */
public interface ViewService {
    public View getViewByPageName(String pageName);
    public List<String> getMenuTitles(View view);
}
