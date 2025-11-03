package com.Day4Cw;

class Employee{
    String name;
    double salary;

    Employee(String n, double s){
        name = n;
        salary = s;
    }

    void calculateBonus(){
        System.out.println("Bonus for Employee: "+(salary*0.05));
    }

}

class Manager extends Employee{
    Manager(String n, double s){
        super(n,s);
    }

    void calculateBonus(){
        System.out.println("Bonus for Manager: "+(salary*0.10));
    }
}

class Intern extends Employee{
    Intern(String n, double s){
        super(n,s);
    }

    void calculateBonus() {
        System.out.println("Bonus for Intern: " + (salary * 0.02));
    }
}

public class EmployeeDemo {
    public static void main(String[] args){
        Employee e1 = new Manager("Alice", 80000);
        Employee e2 = new Intern("Bob", 20000);
        Employee e3 = new Employee("Charlie", 40000);
        Employee[] employees = {e1, e2, e3};

        System.out.println("---- Employee Bonus Details ----");

        for (Employee e : employees) {
            System.out.print(e.name + " -> ");
            e.calculateBonus();
        }
    }
}
