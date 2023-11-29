package com.wit.accountingCompany;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("*************");

        List<Employee> employees=new LinkedList<>();
        employees.add(new Employee(1,"ali","veli"));
        employees.add(new Employee(1,"ali","veli"));
        employees.add(new Employee(2,"ayşe","neşe"));
        employees.add(new Employee(2,"neşe","gül"));
        employees.add(new Employee(3,"gül","mutlu"));

        Map<Integer,Employee> employeeMap=new HashMap<>();
        List<Employee> removedEmps=new ArrayList<>();

        Iterator<Employee> iter =employees.iterator();
//        while (iter.hasNext()){
//            Employee employee=iter.next();
//            if(employee==null){
//                System.out.println("null data buldum");
//                continue;
//            }
//        }
    }
}