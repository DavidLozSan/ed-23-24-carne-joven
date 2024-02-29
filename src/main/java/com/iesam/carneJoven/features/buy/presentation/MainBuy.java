package com.iesam.carneJoven.features.buy.presentation;

import com.iesam.carneJoven.features.buy.data.BuyDataRepository;
import com.iesam.carneJoven.features.buy.domain.GetBuyUseCase;
import com.iesam.carneJoven.features.buy.domain.SaveBuyUseCase;
import com.iesam.carneJoven.features.buy.domain.Buy;

public class MainBuy {
    public static void save(Buy buy) {
        SaveBuyUseCase saveBuyUseCase = new SaveBuyUseCase(BuyDataRepository.newInstance());
        saveBuyUseCase.execute(buy);
    }

    public static void obtainBuy(String id) {
        GetBuyUseCase getBuyUseCase = new GetBuyUseCase(BuyDataRepository.newInstance());
        System.out.println(getBuyUseCase.execute(id));
    }
}
