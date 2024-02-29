package com.iesam.carneJoven.features.promotions.domain;

public class GetPromotionUseCase {
    private final PromotionRepository promotionRepository;

    public GetPromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public Promotion execute(String id) {
        return promotionRepository.obtainPromotion(id);
    }
}
