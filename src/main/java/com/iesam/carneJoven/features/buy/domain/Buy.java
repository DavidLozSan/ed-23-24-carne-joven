package com.iesam.carneJoven.features.buy.domain;

import com.iesam.carneJoven.features.promotions.domain.Promotion;
import com.iesam.carneJoven.features.user.domain.User;

public class Buy {
    private final String id;
    private final String purchaseDate;
    private final Promotion promotion;
    private final User user;

    public Buy(String id, String purchaseDate, Promotion promotion, User user) {
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
