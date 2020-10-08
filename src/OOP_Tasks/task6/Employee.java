package OOP_Tasks.task6;

public class Employee {

    private double tariffPerHour = 5.5;
    public int hours;

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    public double getSalary() {
        return this.tariffPerHour * this.hours;
    }

}
