package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioid;
    @Column(nullable = false)
    private Date portfolioCreationDate;


    @OneToMany
    @JoinColumn(name = "client_id")
    private Client client;

    public Portfolio(long portfolioid, Date portfolioCreationDate) {
        this.portfolioid = portfolioid;
        this.portfolioCreationDate = portfolioCreationDate;
    }

    public long getPortfolioid() {
        return portfolioid;
    }

    public void setPortfolioid(long portfolioid) {
        this.portfolioid = portfolioid;
    }

    public Date getPortfolioCreationDate() {
        return portfolioCreationDate;
    }

    public void setPortfolioCreationDate(Date portfolioCreationDate) {
        this.portfolioCreationDate = portfolioCreationDate;
    }
}
