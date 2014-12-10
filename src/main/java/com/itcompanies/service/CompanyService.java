package com.itcompanies.service;

import com.itcompanies.domain.Company;

import java.util.List;

/**
 * Created by Djordje.Ivanovic on 04/12/2014.
 */
public interface CompanyService extends BaseService {

    public List<Company> findAll();

    public Company saveCompany(Company company);

    public List<Company> findByName(String name);

    public List<Company> findByNumberOfEmployees(int numberOfEmployee);
}
