package com.db.paw.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private double price;

    //@OneToOne(mappedBy="product")
    private int availableQuantity;

    @OneToMany(mappedBy = "product")
    private Set<ProductOrder> productOrder = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="SUPPLIER_ID")
    Supplier suppliers;






}
