package com.raju.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jagapathiraju on 06/08/17.
 */

@Service
public class Employee {

    public List<String> getEmployees(){

        List<String> employees = new ArrayList();

        employees.add("Raju");
        employees.add("Sanvi");
        employees.add("Mahi");

        return employees;
    }


}
