package ClassesInterfaces;

public class SavingAccounts {
    public static int annualInterestRate;
    private int savingsBalance;

    public SavingAccounts(int savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public int getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(int savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public int calculateMonthlyInterest(){
        int monthlyBenefit = (this.savingsBalance * annualInterestRate)/12;    //calculating the monthly benefit
        this.savingsBalance += monthlyBenefit;  //adding the benefit to the saving balance
        return monthlyBenefit;
    }

    public static void modifyInterestRate(int newRate){
        annualInterestRate = newRate;
    }


    public static void main(String[] args) {
        SavingAccounts saver1 = new SavingAccounts(2000);
        SavingAccounts saver2 = new SavingAccounts(3000);
        annualInterestRate = 4;
        System.out.println("Monthly Interest Rate is: " + saver1.calculateMonthlyInterest());
        System.out.println("Savings Balance: " + saver1.getSavingsBalance());
        System.out.println("Monthly Interest Rate is: " + saver2.calculateMonthlyInterest());
        System.out.println("Savings Balance: " + saver2.getSavingsBalance());
        annualInterestRate = 5;                                                                 // as this is a public variable we can access it directly
//        modifyInterestRate(5);
        System.out.println("Monthly Interest Rate is: " + saver1.calculateMonthlyInterest());
        System.out.println("Savings Balance: " + saver1.getSavingsBalance());
        System.out.println("Monthly Interest Rate is: " + saver2.calculateMonthlyInterest());
        System.out.println("Savings Balance: " + saver2.getSavingsBalance());

    }

}
