package com.iesam.carneJoven.features.buy.domain;

public class SaveBuyUseCase {
    public final BuyRepository buyRepository;

    public SaveBuyUseCase(BuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    public void execute(Buy buy) {
        this.buyRepository.save(buy);
    }
}
