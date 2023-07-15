package com.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Imad", "Morocco", "It", "me@imad", 4_550);
        SalariedEmployee e2 = new SalariedEmployee("Imad", "Morocco", "It", "me@imad", 4_550, 500);
        DailyEmployee e3 = new DailyEmployee("Imad", "Morocco", "It", "me@imad", 0, 750, 48);
        HourlyEmployee e4 = new HourlyEmployee("Imad", "Morocco", "It", "me@imad", 0, 35, 50);

        System.out.println("E1 Salary: " + e1.getSalary() + "$");
        System.out.println("E2 Salary: " + e2.getSalary() + "$");
        System.out.println("E3 Salary: " + e3.getSalary() + "$");
        System.out.println("E4 Salary: " + e4.getSalary() + "$");
    }
}