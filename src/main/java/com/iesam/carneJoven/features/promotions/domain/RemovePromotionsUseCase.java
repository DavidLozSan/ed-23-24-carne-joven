package com.iesam.carneJoven.features.promotions.domain;

public class RemovePromotionsUseCase {
    private PromotionRepository promotionRepository;

    public RemovePromotionsUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public void execute() {
        this.promotionRepository.remove();
    }
}
