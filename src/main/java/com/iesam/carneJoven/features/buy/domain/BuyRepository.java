package com.iesam.carneJoven.features.buy.domain;

public interface BuyRepository {
    void save(Buy buy);

    Buy obtainBuy(String id);
}
