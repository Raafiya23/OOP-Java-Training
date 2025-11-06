package com.Day5Cw;

interface Pay {
    void generatePayslip();
}

class Contractors implements Pay {
    public void generatePayslip() {
        System.out.println("Contractor pay is on day basis");
    }
}

class FullTimeEmployees implements Pay {
    @Override
    public void generatePayslip() {
        System.out.println("Full Time Employee salary will be on month basis");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Pay p1 = new Contractors();
        p1.generatePayslip();

        Pay p2 = new FullTimeEmployees();
        p2.generatePayslip();
    }
}
