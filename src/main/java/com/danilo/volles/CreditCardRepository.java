package com.danilo.volles;

import org.jmolecules.ddd.annotation.Repository;

@Repository
public interface CreditCardRepository {

    Card save(Card card);
    Card order(Card card);
    Card findById(String id);

}
