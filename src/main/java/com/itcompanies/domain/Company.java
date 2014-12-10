package com.itcompanies.domain;


import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by Djordje.Ivanovic on 04/12/2014.
 */
public class Company {

    @Id
    private String id;

    private String name;
    private String description;
    private int numberOfEmployees;
    private String street;
    private String streetNo;
    private String city;
    private String website;
    private String comment;

    private List<TechnologyTag> tags;

    public Company() {
    }

    public Company(String name, String description, int numberOfEmployees) {
        this.name = name;
        this.description = description;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<TechnologyTag> getTags() {
        return tags;
    }

    public void setTags(List<TechnologyTag> tags) {
        this.tags = tags;
    }

}
