package com.dejanblog.config;


import com.dejanblog.hrms.*;
import com.dejanblog.repo.Employee;
import com.dejanblog.service.EmployeeServiceImpl;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import java.util.List;
import java.util.stream.Collectors;


@Endpoint
public class EndPointConfiguration {

    @Autowired
    EmployeeServiceImpl service;
    
    
    @PayloadRoot( namespace = "http://dejanblog.com/hrms", localPart = "GetEmployeeRequest")
    @ResponsePayload
    public JAXBElement<GetEmployeeResponse> getEmployee(@RequestPayload GetEmployeeRequest request){
        GetEmployeeResponse response=new GetEmployeeResponse();
        Employee employee=service.getEmployee( request.getEmployeeId());
        response.setEmployeeDetails(mapemployee( employee) );
        return new ObjectFactory().createGetEmployeeResponse(response);

    }

    @PayloadRoot( namespace = "http://dejanblog.com/hrms", localPart = "GetAllEmployeeRequest")
    @ResponsePayload
    public JAXBElement<GetAllEmployeeResponse> getAllEmployee(@RequestPayload GetAllEmployeeRequest request){
        GetAllEmployeeResponse response=new GetAllEmployeeResponse();
        List<Employee> allEmployees=service.getAllEmployee();
        List<EmployeeDetails> allEmployeeDetails = service.getAllEmployee().stream()
                        .map( emp -> mapemployee( emp ) )
                        .collect( Collectors.toList() );

        response.getEmployeeDetails().addAll(allEmployeeDetails);
        return new ObjectFactory().createGetAllEmployeeResponse(response);
    }
    @PayloadRoot( namespace = "http://dejanblog.com/hrms", localPart = "RemoveEmployeeRequest")
    @ResponsePayload
    public JAXBElement<RemoveEmployeeResponse> getAllEmployee(@RequestPayload RemoveEmployeeRequest request){
        RemoveEmployeeResponse response=new RemoveEmployeeResponse();
        boolean status=service.removeEmployee(request.getEmployeeId());
        response.setStatus( status );
        return new ObjectFactory().createRemoveEmployeeResponse(response);
    }
    private EmployeeDetails mapemployee( Employee employee) {
        EmployeeDetails employeeDetails=new EmployeeDetails();
        employeeDetails.setEmployeeId( employee.getEmployeeId() );
        employeeDetails.setEmployeeName( employee.getEmployeeName() );
        employeeDetails.setLocation( employee.getLocation() );
        employeeDetails.setZipCode( employee.getZipCode() );
        return employeeDetails;
    }


}


