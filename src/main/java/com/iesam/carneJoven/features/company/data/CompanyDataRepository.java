package com.iesam.carneJoven.features.company.data;

import com.iesam.carneJoven.features.company.data.local.CompanyFileLocalDataSource;
import com.iesam.carneJoven.features.company.domain.Company;
import com.iesam.carneJoven.features.company.domain.CompanyRepository;

public class CompanyDataRepository implements CompanyRepository {
    public static CompanyDataRepository instance = null;

    private CompanyFileLocalDataSource localCompany = new CompanyFileLocalDataSource();

    public static CompanyDataRepository newInstance() {
        if (instance == null) {
            instance = new CompanyDataRepository();
        }
        return instance;
    }

    @Override
    public void save(Company company) {
        localCompany.saveCompany(company);
    }

    @Override
    public Company obtainCompany(String id) {
        return localCompany.obtainCompany(id);
    }
}
