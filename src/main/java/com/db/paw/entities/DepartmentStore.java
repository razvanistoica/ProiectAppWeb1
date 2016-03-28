package com.db.paw.entities;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/28/16
 * Time: 1:29 PM
 * To change this template use File | Settings | File Templates.
 */

    @Entity
    public class DepartmentStore {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
        private String name;
        private String city;
        private String street;
        private int streetNo;

        @OneToOne(mappedBy = "departmentStore")
        private User user;




    }

