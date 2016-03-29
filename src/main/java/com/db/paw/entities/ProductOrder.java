package com.db.paw.entities;



import org.eclipse.persistence.internal.jpa.metadata.accessors.mappings.ManyToOneAccessor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/29/16
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class ProductOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "ORDERS_ID")
    private Orders orders;

    @OneToMany(mappedBy = "product")
    private Set<ProductOrder> productOrder = new HashSet<>();

    private int orderedQuantity;

    private double totalPrice;

}
