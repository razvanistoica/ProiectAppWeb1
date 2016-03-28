package com.db.paw.entities;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String age;
    private String sex;

    @ManyToOne
    @JoinColumn(name = "shop")
    private Shop shop;

    @ManyToOne
    @JoinColumn(name = "status")
    private Status status;

    public User() {
    }

    public User(String name, String email, String password, String age, String sex, Shop shop, Status status) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.shop = shop;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
