package com.db.paw.entities;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/27/16
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

}
