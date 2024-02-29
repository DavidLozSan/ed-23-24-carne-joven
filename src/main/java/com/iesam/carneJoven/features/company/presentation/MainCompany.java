package com.iesam.carneJoven.features.company.presentation;

import com.iesam.carneJoven.features.company.data.CompanyDataRepository;
import com.iesam.carneJoven.features.company.domain.Company;
import com.iesam.carneJoven.features.company.domain.GetCompanyUseCase;
import com.iesam.carneJoven.features.company.domain.SaveCompanyUseCase;

public class MainCompany {
    public static void save(Company company) {
        SaveCompanyUseCase saveCompanyUseCase = new SaveCompanyUseCase(CompanyDataRepository.newInstance());
        saveCompanyUseCase.execute(company);
    }

    public static void obtainCompany(String id) {
        GetCompanyUseCase getCompanyUseCase = new GetCompanyUseCase(CompanyDataRepository.newInstance());
        System.out.println(getCompanyUseCase.execute(id));
    }
}
