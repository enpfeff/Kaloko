package com.kaloko.model;

import javax.persistence.*;

/**
 * Created by enpfeff on 4/1/14.
 */
@Entity
@Table(name = "USER_ROLES", schema = "", catalog = "KALOKO_DB")
public class UserRoles {
    private int userId;
    private int roleId;
    private String id;

    @Basic
    @Column(name = "USER_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ROLE_ID")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoles userRoles = (UserRoles) o;

        if (roleId != userRoles.roleId) return false;
        if (userId != userRoles.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + roleId;
        return result;
    }



    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
