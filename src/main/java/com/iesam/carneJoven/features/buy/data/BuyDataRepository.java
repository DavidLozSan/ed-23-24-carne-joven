package com.iesam.carneJoven.features.buy.data;

import com.iesam.carneJoven.features.buy.data.local.BuyFileLocalDataSource;
import com.iesam.carneJoven.features.buy.domain.Buy;
import com.iesam.carneJoven.features.buy.domain.BuyRepository;

public class BuyDataRepository implements BuyRepository {
    public static BuyDataRepository instance = null;
    private BuyFileLocalDataSource localBuy = new BuyFileLocalDataSource();

    public static BuyDataRepository newInstance() {
        if (instance == null) {
            instance = new BuyDataRepository();
        }
        return instance;
    }

    @Override
    public void save(Buy buy) {
        localBuy.saveBuy(buy);
    }

    @Override
    public Buy obtainBuy(String id) {
        return localBuy.obtainBuy(id);
    }
}
