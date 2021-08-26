package com.dejanblog.repo;

import java.util.ArrayList;
import java.util.List;

public class OfflineRepository{
    @org.jetbrains.annotations.NotNull
    public static List<Employee> getEmployee(){
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(123,"Dejan","Doboj",053));
        empList.add(new Employee(124,"Vanja","Orasje",053));
        empList.add(new Employee(125,"Luka","Doboj",053));
        empList.add(new Employee(126,"Zoja","Geto",053));

        return empList;
    }
}
