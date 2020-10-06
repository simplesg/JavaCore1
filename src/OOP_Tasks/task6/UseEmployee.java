package OOP_Tasks.task6;

import OOP_Tasks.task7.Manager;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.hours = 20;
        System.out.println("Tarif per hour is: " + employee.getTariffPerHour());
        System.out.println("Salary of employee is: " + employee.getSalary());

        Manager manager = new Manager();
        manager.hours = 20;
        System.out.println("Salary of manager is: " + manager.getSalary());
    }
}
