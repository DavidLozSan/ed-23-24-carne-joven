package com.iesam.carneJoven.features.promotions.presentation;

import com.iesam.carneJoven.features.promotions.data.PromotionDataRepository;
import com.iesam.carneJoven.features.promotions.domain.*;

public class MainPromotion {
    public static void save(Promotion promotion) {
        SavePromotionUseCase savePromotionUseCase = new SavePromotionUseCase(PromotionDataRepository.newInstance());
        savePromotionUseCase.execute(promotion);
    }

    public static void remove() {
        RemovePromotionsUseCase removePromotionUseCase = new RemovePromotionsUseCase(PromotionDataRepository.newInstance());
        removePromotionUseCase.execute();
    }

    public static void obtainPromotion(String id) {
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(PromotionDataRepository.newInstance());
        System.out.println(getPromotionUseCase.execute(id));
    }

    public static void obtainPromotions() {
        GetPromotionsUseCase getPromotionsUseCase = new GetPromotionsUseCase(PromotionDataRepository.newInstance());
        System.out.println(getPromotionsUseCase.execute());
    }
}
