package com.itcompanies.controller;

import com.itcompanies.domain.Company;
import com.itcompanies.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Djordje.Ivanovic on 04/12/2014.
 */
@RequestMapping("/api/**")
@RestController
public class CompanyController {

    @Autowired
    protected CompanyService companyService;

    @RequestMapping(value = "/saveCompany", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Company saveCompany(Company company) {
        return companyService.saveCompany(company);
    }

    @RequestMapping(value = "/companies", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Company> getCompanies() {
        return companyService.findAll();
    }

    @RequestMapping(value = "/company", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Company> getCompany( String name) {
        return companyService.findByName(name);
    }

    @RequestMapping(value = "/companyByNOE", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Company> getCompanyByNumberOfEmployees( int numberOfEmployee) {
        return companyService.findByNumberOfEmployees(numberOfEmployee);
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String error() {
        return "Greska!!!";
    }


}
