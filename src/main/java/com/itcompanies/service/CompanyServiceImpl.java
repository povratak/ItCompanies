package com.itcompanies.service;

import com.itcompanies.domain.Company;
import com.itcompanies.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Djordje.Ivanovic on 04/12/2014.
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> findByName(String name) {
        return companyRepository.findAllByName(name);
    }

    @Override
    public List<Company> findByNumberOfEmployees(int numberOfEmployee) {
        return companyRepository.findByNumberOfEmployees(numberOfEmployee);
    }
}
