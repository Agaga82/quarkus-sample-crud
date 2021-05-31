package org.agaga;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Hello extends PanacheEntity{

    public String texte;
    
    public Hello(){

    }

    public Hello(String texte){
        this.texte=texte;
    }

}
