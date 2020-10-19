package CustomExceptions;

import java.util.ArrayList;
import java.util.List;

public class ClientRepo {
    List<Client> clientList = new ArrayList<>();

    ClientRepo() {
        clientList.add(new Client(20, "Sorin", true, 700, true));
        clientList.add(new Client(23, "Vlad", true, 15000, true));
        clientList.add(new Client(41, "Angela", true, 12000, true));
        clientList.add(new Client(12, "Petru", true, 110, true));
        clientList.add(new Client(45, "Andrei", false, 5000, false));
    }

    void addClient(int age, String name, boolean hasJob, double salary, boolean citizenship) {
        clientList.add(new Client(age, name, hasJob, salary, citizenship));
        System.out.println("Welcome our new client!");
    }

    Client getClient(String name) throws InvalidClientException {
        for (Client client : clientList) {
            if (name.equals(client.getName())) {
                return client;
            }
        }
        throw new InvalidClientException();
    }
}
