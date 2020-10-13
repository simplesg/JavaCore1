package CustomExceptions;

import java.util.Scanner;

public class IllegibleAccountException extends Exception {

    public IllegibleAccountException() {
        super();
    }

    public IllegibleAccountException(int amount) {
        super();
        System.out.println("Sorry! You don't have that " + amount + " on your balance.");
    }

    public IllegibleAccountException(BankClient bankClient) {
        super();
        bankClient.setBalance(0);
        System.out.println("Invalid account balance!");
        System.out.println("The balance is set to " + bankClient.getBalance());
    }

    public IllegibleAccountException(String message) {
        super(message);
        System.out.println("Your bank account is too low!");
    }

    public IllegibleAccountException(BankClient bankClient, String problem) {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your account");
        if (scanner.nextLine().equals(bankClient.getName())) {
            System.out.println("Your money has been deposited");
            bankClient.setBalance((int) (bankClient.getBalance() * 1.05));                  //added 5% to balance

        } else {
            System.out.println("Your name is incorrect!");
            System.out.println("You need to initiate the process again");

        }
    }

    public IllegibleAccountException(BankClient bankClient, BankClient secondBankClient, int amount) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("You don't have enough money");
        System.out.println("Do you want to donate the whole balance of " + bankClient.getBalance() + " ? (yes/no)");
        if (scanner1.nextLine().equals("yes")) {
            secondBankClient.setBalance(bankClient.getBalance() + secondBankClient.getBalance());
            bankClient.setBalance(0);
        } else {
            System.out.println(bankClient.toString());
            System.out.println(secondBankClient.toString());
        }
    }
}
