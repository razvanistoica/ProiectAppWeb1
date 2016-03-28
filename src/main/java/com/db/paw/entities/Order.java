package com.db.paw.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/28/16
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    public Date date;

    @ManyToMany(mappedBy="orders")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;


}
