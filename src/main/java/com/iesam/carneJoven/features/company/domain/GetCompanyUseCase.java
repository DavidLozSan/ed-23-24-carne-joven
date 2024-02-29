package com.iesam.carneJoven.features.company.domain;


public class GetCompanyUseCase {
    public final CompanyRepository companyRepository;

    public GetCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company execute(String id) {
        return companyRepository.obtainCompany(id);
    }
}
