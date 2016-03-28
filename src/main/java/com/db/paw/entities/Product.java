package com.db.paw.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/28/16
 * Time: 1:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String description;

    //@OneToOne(mappedBy="product")
    private Integer stock;

    @ManyToMany
    @JoinTable(name="PRODUCT_ORDER", joinColumns=@JoinColumn(name="PRODUCT_ID"), inverseJoinColumns=@JoinColumn(name="ORDER_ID"))
    private List<Order> orders;

    @ManyToOne
    @JoinColumn(name="SUPPLIER_ID")
    Supplier suppliers;


}
