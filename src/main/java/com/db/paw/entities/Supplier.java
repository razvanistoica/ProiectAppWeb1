package com.db.paw.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/28/16
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy="suppliers")
    private List<Product> products;

    private String firstname;
    private String lastname;
    private String telephone;
    private String eMail;



}
