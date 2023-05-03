package com.example.mysql.Dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BusinessCentral {

    private List loadFields = new ArrayList<>();

    public BusinessCentral Join() {

        return this;
    }

    public String Query() {

        return "ok";
    }

}
