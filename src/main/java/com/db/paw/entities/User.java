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

    @OneToOne
    @JoinColumn(name = "DEPARTMENTSTORE_ID")
    private DepartmentStore departmentStore;

    @Column(columnDefinition = "VARCHAR")
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy="user")
    private List<Orders> orders;



    public enum Role{
        EMPLOYEE , MANAGER , SUPPLIER , ADMIN
    }
    public User() {
    }

    public User(String firstname) {
        this.firstname = firstname;
    }


    public User(String firstname, String lastname, String telephone, String eMail, String password, DepartmentStore departmentStore, Role role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephone = telephone;
        this.eMail = eMail;
        this.password = password;
        this.departmentStore = departmentStore;
        this.role = role;
    }

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

    public void setRoles(Role role) {
        this.role = role;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
