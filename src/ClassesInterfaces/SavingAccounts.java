package ClassesInterfaces;

import java.util.Scanner;

public class SavingAccounts implements CalculateInterest {
    public static double annualInterestRate;
    private double savingsBalance;

    public SavingAccounts(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    @Override
    public double calculateMonthlyInterest() {
        double monthlyBenefit = (this.savingsBalance * annualInterestRate) / 12;    //calculating the monthly benefit
        this.savingsBalance += monthlyBenefit;  //adding the benefit to the saving balance
        return monthlyBenefit;
    }

    public static void modifyInterestRate(int newRate) {
        annualInterestRate = (double) newRate / 100;
    }


    public static void main(String[] args) {
        SavingAccounts saver1 = new SavingAccounts(2000);
        SavingAccounts saver2 = new SavingAccounts(3000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set % of the annualInterestRate");
        String value = scanner.nextLine();
        modifyInterestRate(Integer.parseInt(value));
        System.out.println("Monthly Interest Rate is: " + saver1.calculateMonthlyInterest());
        System.out.println("Savings Balance: " + saver1.getSavingsBalance());
        System.out.println("Monthly Interest Rate is: " + saver2.calculateMonthlyInterest());
        System.out.println("Savings Balance: " + saver2.getSavingsBalance());
        // as this is a public variable we can access it directly
        modifyInterestRate(5);
        System.out.println("Monthly Interest Rate is: " + saver1.calculateMonthlyInterest());
        System.out.println("Savings Balance: " + saver1.getSavingsBalance());
        System.out.println("Monthly Interest Rate is: " + saver2.calculateMonthlyInterest());
        System.out.println("Savings Balance: " + saver2.getSavingsBalance());

    }

}
