package com.itcompanies.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by Djordje.Ivanovic on 08/12/2014.
 */
public class TechnologyTag {
    @Id
    private String id;

    private String name;
}
