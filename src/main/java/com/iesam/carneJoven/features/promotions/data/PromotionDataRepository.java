package com.iesam.carneJoven.features.promotions.data;

import com.iesam.carneJoven.features.promotions.data.local.PromotionFileLocalDataSource;
import com.iesam.carneJoven.features.promotions.domain.Promotion;
import com.iesam.carneJoven.features.promotions.domain.PromotionRepository;

import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {
    public static PromotionDataRepository instance = null;
    private PromotionFileLocalDataSource localPromotion = new PromotionFileLocalDataSource();

    public static PromotionDataRepository newInstance() {
        if (instance == null) {
            instance = new PromotionDataRepository();
        }
        return instance;
    }

    @Override
    public void save(Promotion promotion) {
        localPromotion.savePromotion(promotion);
    }

    @Override
    public Promotion obtainPromotion(String id) {
        return localPromotion.obtainPromotion(id);
    }

    @Override
    public ArrayList<Promotion> obtainPromotions() {
        return localPromotion.obtainPromotions();

    }

    @Override
    public void remove() {
        localPromotion.clear();
    }
}