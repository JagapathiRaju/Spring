package com.raju.rest;

import com.raju.services.Employee;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by jagapathiraju on 06/08/17.
 */

@Component
@Path("/details")
public class EmployeeController {

    private Employee employee;
    public EmployeeController(Employee employee){
        this.employee=employee;
    }

    @Path("/all")
    @GET
    @Produces("application/json")
    public List<String> getAllEmployees(){
        return  employee.getEmployees();
    }
}
