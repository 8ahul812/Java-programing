package oopsConcept;
// parametrized constriuctor
public class Employee {
    String name;
    int emp_id;                       // through this keyword same name 
    Employee(String s,int x){         // Employee(String name,int emp_id)
        name = s;                     // this.name=name
        emp_id  = x;                  // this.emp_id=emp_id
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul",18);
        Employee e2 = new Employee("suraj",76);
        System.out.println("Employee 1 : "+e1.name+ " "+e1.emp_id);
        System.out.println("Employee 2 : "+e2.name+ " "+e2.emp_id);
    }
    
}
