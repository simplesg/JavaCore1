package CustomExceptions;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class BankClient {
    private int balance;
    private String name;
    private LocalDate dateOfBirth;
    private boolean canDeposit;

    public BankClient(int balance, String name, LocalDate date) {
        this.balance = balance;
        this.name = name;
        this.dateOfBirth = date;
        this.canDeposit = false;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(boolean canDeposit) {
        this.canDeposit = canDeposit;
    }

    @Override
    public String toString() {
        return "Account of " + this.name + " holds that sum of money -> " + this.balance;
    }


    @Override
    public int hashCode() {
        return Objects.hash(balance, name, dateOfBirth, canDeposit);
    }

    boolean canWithdraw(int amount) {
        return this.balance - amount > 0;
    }

    void withdrawMoney(int amount) throws IllegibleAccountException {
        if (this.balance < 0) {
            throw new IllegibleAccountException(this);
        }
        if (amount < 0) {
            throw new IllegibleAccountException();
        }
        if (this.balance - amount < 0) {
            throw new IllegibleAccountException(amount);
        } else {
            this.setBalance(this.balance - amount);
        }
    }

    void addMoney(int amount) throws IllegibleAccountException {
        if (amount < 0) {
            throw new IllegibleAccountException();
        }
        this.setBalance(this.balance + amount);
        System.out.println(this.getName() + " added " + amount + " to his/her balance");
    }

    boolean eligibleToDeposit() throws IllegibleAccountException {
        if (this.balance < 1000) {
            throw new IllegibleAccountException("You haven't reached the recommended limit");
        }
        return true;
    }

    void makeDeposit() throws IllegibleAccountException {
        if (dateOfBirth.getYear() > 2002) {
            throw new IllegibleAccountException("You're not eligible to deposit money because of age");
        }
        if (eligibleToDeposit()) {
            System.out.println("You will be able to deposit after some steps!");
            throw new IllegibleAccountException(this, "makeDeposit");
        } else {
            throw new IllegibleAccountException("You haven't reached the recommended limit");
        }
    }

    void donateMoney(BankClient anotherClient, int amount) throws IllegibleAccountException {
        if(this.canWithdraw(amount)){
            this.withdrawMoney(amount);
            anotherClient.addMoney(amount);
        }else{
            throw new IllegibleAccountException(this, anotherClient, amount);
        }
    }


}
