package com.itcompanies.repository;

import com.itcompanies.domain.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Djordje.Ivanovic on 04/12/2014.
 */
@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {
    @Override
    public List<Company> findAll();

    @Override
    public Company save(Company company);

    public List<Company> findAllByName(String name);

    public List<Company> findByNumberOfEmployees(int numberOfEmployee);
}
