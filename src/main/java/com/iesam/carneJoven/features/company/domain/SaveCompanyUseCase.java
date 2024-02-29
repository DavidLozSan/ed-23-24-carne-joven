package com.iesam.carneJoven.features.company.domain;

public class SaveCompanyUseCase {
    public final CompanyRepository companyRepository;

    public SaveCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void execute(Company company) {
        this.companyRepository.save(company);
    }
}
