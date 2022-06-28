

package com.teameth.moviebooking.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Role {
    @Id
    private int roleid;

    private String name;
    private String description;


/* @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "Users_inRoles",
            joinColumns = {
                    @JoinColumn(name = "roleid")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "useridid" ) })
*/

//Set<User> users = new HashSet<>();

    public Role() {

    }

    public Role(int roleid, String name, String description) {
        this.roleid = roleid;
        this.name = name;
        this.description = description;
    }

    public int getroleid() {
        return roleid;
    }


    public void setroleid(int roleid) {
        this.roleid = roleid;
    }

    public String getName() {
        return name;
    }

    public int getRoleId() {
        return roleid;
    }

    public void setRoleId(int roleid) {
        this.roleid = roleid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


