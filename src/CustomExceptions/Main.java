package CustomExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //To pass all exceptions:
        //age > 18  if < 18 a parent or a friend can take credit for you
        //Have a job = true
        //Moldovan citizenship = true
        //salary > 1000

        ClientRepo clientRepo = new ClientRepo();
        System.out.println("Welcome to our bank!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you new?");
        String rspv = scanner.nextLine();
        if (rspv.equals("yes")) {
            System.out.println("Age:");
            String age = scanner.nextLine();
            System.out.println("Name :");
            String name = scanner.nextLine();
            System.out.println("Have a job? (yes/no)");
            String job = scanner.nextLine();
            if (job.equals("yes")) {
                job = "true";
            } else {
                job = "false";
            }
            System.out.println("Enter salary :");
            String salary = scanner.nextLine();
            System.out.println("Hold a Moldovan citizenship (yes/no)");
            String citizenship = scanner.nextLine();
            if (citizenship.equals("yes")) {
                citizenship = "true";
            } else {
                citizenship = "false";
            }
            clientRepo.addClient(Integer.parseInt(age),name,Boolean.parseBoolean(job),Double.parseDouble(salary),Boolean.parseBoolean(citizenship));
        }else{
            System.out.println("============================");
        }
        System.out.println("============================");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        try {
            clientRepo.getClient(name);
            try {
                System.out.println("Checking if you can get a credit");
                clientRepo.getClient(name).canGetCredit();
            } catch (InvalidClientException m){
                System.out.println(m.cantGetCredit());
            }
        } catch (InvalidClientException e) {
            System.out.println(e.clientNotFound());
        }
    }
}

