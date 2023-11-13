package br.com.lucasalves.projectpoo.model;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String products;
    private Float prices;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProducts() {
        return products;
    }
    public void setProducts(String procedure) {
        this.products = procedure;
    }
    public Float getPrices() {
        return prices;
    }
    public void setPrices(Float price) {
        this.prices = price;
    }
 
}
