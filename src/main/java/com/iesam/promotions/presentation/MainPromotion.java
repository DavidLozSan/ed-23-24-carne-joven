package com.iesam.promotions.presentation;

import com.iesam.promotions.data.PromotionDataRepository;
import com.iesam.promotions.domain.Promotion;
import com.iesam.promotions.domain.SavePromotionUseCase;

public class MainPromotion {
    public static void save(Promotion promotion) {
        SavePromotionUseCase savePromotionUseCase = new SavePromotionUseCase(PromotionDataRepository.newInstance());
        savePromotionUseCase.execute(promotion);
    }
}
