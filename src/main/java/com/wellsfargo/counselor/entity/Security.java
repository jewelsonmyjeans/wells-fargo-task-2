package com.wellsfargo.counselor.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

  

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private double purchasePrice;

    @Column(nullable=false)
    private Date purchaseDate;

    @Column(nullable=false)
    private int quantity;

    protected Security(){}

        public Security(long securityId, Portfolio portfolio, String name, String category, double purchasePrice,
            Date purchaseDate, int quantity) {
        this.securityId = securityId;
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    

    
      public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public long getSecurityId() {
        return securityId;
    }
}