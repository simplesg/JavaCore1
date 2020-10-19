package CustomExceptions;

import java.util.Scanner;

public class Client {
    private int age;
    private String name;
    private boolean hasJob;
    private double salaryAmount;
    private boolean citizenship;


    public Client(int age, String name, boolean hasJob, double salaryAmount, boolean citizenship) {
        this.age = age;
        this.name = name;
        this.hasJob = hasJob;
        this.salaryAmount = salaryAmount;
        this.citizenship = citizenship;
    }

    public String getName() {
        return this.name;
    }

    public void checkAge() throws InvalidClientException {
        if (this.age < 18) {
            throw new InvalidClientException();
        } else {
            System.out.println("Passed the age check!");
        }
    }

    public void checkJob() throws InvalidClientException {
        if (hasJob) {
            System.out.println("You have a job!");
        } else {
            throw new InvalidClientException();
        }
    }

    public void checkSalary() throws InvalidClientException {
        if (this.salaryAmount < 1000) {
            throw new InvalidClientException();
        } else {
            System.out.println("The salary you have is enough to get a credit!");
        }
    }

    public void checkCitizenship() throws InvalidClientException {
        if (this.citizenship) {
            System.out.println("You are from Moldova! You can be our client!");
        } else {
            throw new InvalidClientException();
        }
    }

    public void canGetCredit() {
        try {
            System.out.println("Checking age:");
            this.checkAge();
            try {
                System.out.println("Checking citizenship:");
                this.checkCitizenship();
                try {
                    System.out.println("Checking if the client has a job:");
                    this.checkJob();
                    try {
                        System.out.println("Checking salary:");
                        this.checkSalary();
                        System.out.println("We can offer you a credit!");
                    } catch (InvalidClientException e) {
                        System.out.println(e.invalidSalary());
                    }
                } catch (InvalidClientException e) {
                    System.out.println(e.invalidJob());
                }
            } catch (InvalidClientException e) {
                System.out.println(e.invalidCitizenship());
            }
        } catch (InvalidClientException e) {
            System.out.println(e.invalidAge());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you have a parent or a friend who has more than 18 years? (yes/no)");
            String decision = scanner.nextLine();
            if (decision.equals("yes")) {
                System.out.println("Enter details of the person!");
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Has a job?");
                String job = scanner.nextLine();
                if (job.equals("yes")) {
                    job = "true";
                } else {
                    job = "false";
                }
                System.out.println("Enter salary:");
                String salary = scanner.nextLine();
                System.out.println("Holds a Moldovan citizenship:");
                String citizenship = scanner.nextLine();
                if (citizenship.equals("yes")) {
                    citizenship = "true";
                } else {
                    citizenship = "false";
                }
                Client newClient = new Client(19, name, Boolean.parseBoolean(job), Integer.parseInt(salary), Boolean.parseBoolean(citizenship));
                try {
                    newClient.checkSalary();
                    newClient.checkJob();
                    newClient.checkAge();
                    newClient.checkCitizenship();
                    System.out.println("We can offer you a credit!");
                } catch (InvalidClientException m) {
                    System.out.println(m.invalidNewClient(newClient));
                }
            } else {
                System.out.println(e.cantGetCredit());
            }
        } finally {
            System.out.println("Thank you for choosing our bank!");
        }
    }
}
