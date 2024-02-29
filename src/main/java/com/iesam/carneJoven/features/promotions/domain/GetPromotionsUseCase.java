package com.iesam.carneJoven.features.promotions.domain;

import java.util.ArrayList;

public class GetPromotionsUseCase {
    private final PromotionRepository promotionRepository;

    public GetPromotionsUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public ArrayList<Promotion> execute() {
        return promotionRepository.obtainPromotions();
    }
}
