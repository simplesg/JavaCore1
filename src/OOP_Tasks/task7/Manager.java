package OOP_Tasks.task7;

import OOP_Tasks.task6.Employee;

public class Manager extends Employee {
    @Override
    public double getSalary(){
        return super.getTariffPerHour() * super.hours * 1.5;
    }
}
