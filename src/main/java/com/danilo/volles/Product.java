package com.danilo.volles;

import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Entity
public class Product {

    @Identity
    private String id;
}
