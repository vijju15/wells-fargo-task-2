package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityid;
    @Column(nullable = false)
    private String securityName;
    @Column(nullable = false)
    private String securityCategory;
    @Column(nullable = false)
    private Date securityPurchaseDate;
    @Column(nullable = false)
    private double securityPurchasePrice;
    @Column(nullable = false)
    private long securityQuantity;

    @OneToMany
    @JoinColumn(name="portfolio_id")
    private Portfolio portfolio;

    public Security(long securityid, String securityName, String securityCategory, Date securityPurchaseDate, double securityPurchasePrice, long securityQuantity) {
        this.securityid = securityid;
        this.securityName = securityName;
        this.securityCategory = securityCategory;
        this.securityPurchaseDate = securityPurchaseDate;
        this.securityPurchasePrice = securityPurchasePrice;
        this.securityQuantity = securityQuantity;
    }

    public long getSecurityid() {
        return securityid;
    }

    public void setSecurityid(long securityid) {
        this.securityid = securityid;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public Date getSecurityPurchaseDate() {
        return securityPurchaseDate;
    }

    public void setSecurityPurchaseDate(Date securityPurchaseDate) {
        this.securityPurchaseDate = securityPurchaseDate;
    }

    public double getSecurityPurchasePrice() {
        return securityPurchasePrice;
    }

    public void setSecurityPurchasePrice(double securityPurchasePrice) {
        this.securityPurchasePrice = securityPurchasePrice;
    }

    public long getSecurityQuantity() {
        return securityQuantity;
    }

    public void setSecurityQuantity(long securityQuantity) {
        this.securityQuantity = securityQuantity;
    }
}
