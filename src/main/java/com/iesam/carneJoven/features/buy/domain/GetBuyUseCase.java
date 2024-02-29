package com.iesam.carneJoven.features.buy.domain;

public class GetBuyUseCase {
    public final BuyRepository buyRepository;

    public GetBuyUseCase(BuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    public Buy execute(String id) {
        return buyRepository.obtainBuy(id);
    }
}
