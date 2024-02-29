package com.iesam.purchase.domain;

import com.iesam.promotion.domain.Promotion;
import com.iesam.user.domain.User;

public class Purchase {
    private final String id;
    private final String purchaseDate;
    private final Promotion promotion;
    private final User user;

    public Purchase(String id, String purchaseDate, Promotion promotion, User user) {
        this.id = id;
        this.purchaseDate = purchaseDate;
        this.promotion = promotion;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public User getUser() {
        return user;
    }
}
