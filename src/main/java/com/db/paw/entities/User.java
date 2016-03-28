package com.db.paw.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/27/16
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastname;
    private String telephone;
    private String eMail;

    private String password;


    public User() {
    }

    public User(String firstname, String lastname, String telephone, String eMail, String password, DepartmentStore departmentStore, List<Role> roles, List<Order> orders) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephone = telephone;
        this.eMail = eMail;
        this.password = password;
        this.departmentStore = departmentStore;
        this.role = role;
        this.orders = orders;
    }

    @OneToOne
    @JoinColumn(name = "DEPARTMENTSTORE_ID")
    private DepartmentStore departmentStore;

    //@Enumerated
    private Role role;

    @OneToMany(mappedBy="user")
    private List<Order> orders;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DepartmentStore getDepartmentStore() {
        return departmentStore;
    }

    public void setDepartmentStore(DepartmentStore departmentStore) {
        this.departmentStore = departmentStore;
    }

    public Role getRoles() {
        return role;
    }

    public void setRoles(List<Role> roles) {
        this.role = role;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
