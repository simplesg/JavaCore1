package CustomExceptions;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        BankClient bankClient = new BankClient(0, "Sorin", LocalDate.of(1998, 9, 28));
        BankClient bankClient1 = new BankClient(0, "David", LocalDate.of(2001, 4, 12));
        BankClient bankClient2 = new BankClient(0, "Andrei", LocalDate.of(1978, 9, 1));
        BankClient bankClient3 = new BankClient(0, "Daniel", LocalDate.of(2003, 5, 4));
        try {
            bankClient.setBalance(-10);
            System.out.println("Trying to withdraw money:");
            bankClient.withdrawMoney(20);
        } catch (IllegibleAccountException e) {
            printLines();
        } finally {
            try {
                System.out.println("Trying to add money:");
                bankClient.addMoney(60);
                printLines();
                System.out.println("Trying to withdraw money");
                bankClient.withdrawMoney(50);
            } catch (IllegibleAccountException e) {
                printLines();
            } finally {
                System.out.println("Your accounts balance is: " + bankClient.getBalance());
                printLines();
                try {
                    System.out.println("Trying to know if eligible to deposit!");
                    bankClient.eligibleToDeposit();
                } catch (IllegibleAccountException e) {
                    System.out.println(e.getMessage());
                    printLines();
                } finally {
                    try {
                        bankClient.addMoney(1000);
                        printLines();
                        bankClient.makeDeposit();
                    } catch (IllegibleAccountException e) {
                        printLines();
                    }finally {
                        System.out.println(bankClient.toString());
                        try{
                            bankClient.setBalance(50);
                            bankClient.donateMoney(bankClient2, 60);

                        }catch (IllegibleAccountException e){
                            printLines();
                        }finally {
                            System.out.println(bankClient);
                            System.out.println(bankClient2);
                        }
                    }
                }
            }
        }
    }

    public static void printLines() {
        System.out.println("-----------");
    }
}
