package com.iesam.promotions.data;

import com.iesam.promotions.domain.Promotion;
import com.iesam.promotions.domain.PromotionRepository;

import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {
    public static PromotionDataRepository instance = null;
    private ArrayList<Promotion> localPromotion = new ArrayList<>();

    public static PromotionDataRepository newInstance() {
        if (instance == null) {
            instance = new PromotionDataRepository();
        }
        return instance;
    }

    @Override
    public void save(Promotion promotion) {
        localPromotion.add(promotion);
    }
}
