package com.wellsfargo.counselor.entity;
import jakarta.persistence.Entity;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable=false)
    private Date creationDate;

    @ManyToOne
    private Client client;

    protected Portfolio(){}

    public Portfolio(long portfolioId, Date creationDate, Client client){
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

}