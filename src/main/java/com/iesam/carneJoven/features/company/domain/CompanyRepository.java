package com.iesam.carneJoven.features.company.domain;

public interface CompanyRepository {
    void save(Company company);
    Company obtainCompany(String id);
}
