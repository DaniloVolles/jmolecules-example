package com.danilo.volles;

import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Entity
public class Card {

    @Identity
    private String id;

    private String number;

    private String holderName;
}
