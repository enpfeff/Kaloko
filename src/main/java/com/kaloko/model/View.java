package com.kaloko.model;

import javax.persistence.*;

/**
 * Created by enpfeff on 3/31/14.
 */
@Entity
@Table(name = "VIEW", schema = "", catalog = "KALOKO_DB")
public class View {
    private int id;
    private String pageName;
    private String title;
    private String menuTitles;
    private String footer;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PAGE_NAME")
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "MENU_TITLES")
    public String getMenuTitles() {
        return menuTitles;
    }

    public void setMenuTitles(String menuTitles) {
        this.menuTitles = menuTitles;
    }

    @Basic
    @Column(name = "FOOTER")
    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        View views = (View) o;

        if (id != views.id) return false;
        if (footer != null ? !footer.equals(views.footer) : views.footer != null) return false;
        if (menuTitles != null ? !menuTitles.equals(views.menuTitles) : views.menuTitles != null) return false;
        if (pageName != null ? !pageName.equals(views.pageName) : views.pageName != null) return false;
        if (title != null ? !title.equals(views.title) : views.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (pageName != null ? pageName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (menuTitles != null ? menuTitles.hashCode() : 0);
        result = 31 * result + (footer != null ? footer.hashCode() : 0);
        return result;
    }
}
