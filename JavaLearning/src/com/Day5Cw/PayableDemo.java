package com.Day5Cw;

interface Payable{
    void generatePayslip();
}

class Contractor implements Payable{
    String name;
    double hourlyRate;
    int hoursWorked;

    Contractor(String n, double rate, int hours){
        name = n;
        hourlyRate = rate;
        hoursWorked = hours;
    }

    public void generatePayslip(){
        double pay = hourlyRate * hoursWorked;
        System.out.println("---- Contractor Payslip ----");
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: " + pay);
    }
}

class FullTimeEmployee implements Payable {
    String name;
    double monthlySalary;

    FullTimeEmployee(String n, double salary) {
        name = n;
        monthlySalary = salary;
    }

    public void generatePayslip() {
        System.out.println("---- Full-Time Employee Payslip ----");
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

public class PayableDemo {
    public static void main(String[] args){
        Payable p1 = new Contractor("John", 500, 40);
        Payable p2 = new FullTimeEmployee("Alice", 60000);

        Payable[] employees = {p1, p2};

        for (Payable p : employees) {
            p.generatePayslip();
            System.out.println();
        }
    }
}
