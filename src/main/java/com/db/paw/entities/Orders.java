package com.db.paw.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/28/16
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    public Date date;

    @OneToMany(mappedBy = "orders")
    private Set<ProductOrder> productOrder = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;


}
