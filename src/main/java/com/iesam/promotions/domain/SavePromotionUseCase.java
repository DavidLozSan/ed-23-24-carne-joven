package com.iesam.promotions.domain;

public class SavePromotionUseCase {
    private final PromotionRepository promotionRepository;

    public SavePromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public void execute(Promotion promotion) {
        this.promotionRepository.save(promotion);
    }
}
