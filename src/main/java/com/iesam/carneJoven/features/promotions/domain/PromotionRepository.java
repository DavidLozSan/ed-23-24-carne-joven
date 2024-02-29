package com.iesam.carneJoven.features.promotions.domain;

import java.util.ArrayList;

public interface PromotionRepository {
    void save(Promotion promotion);

    Promotion obtainPromotion(String id);

    ArrayList<Promotion> obtainPromotions();

    void remove();
}
