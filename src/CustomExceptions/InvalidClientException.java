package CustomExceptions;

public class InvalidClientException extends Exception{
    String invalidAge(){
        return "Sorry, you're under aged!";
    }

    String invalidSalary(){
        return "You don't have the minimum necessary amount of salary which is 1000";
    }

    String invalidJob(){
        return "You are unemployed" + "     You can't pay the credit if you dont have a job";
    }

    String invalidCitizenship(){
        return "You should hold a Moldovan citizenship";
    }

    String invalidNewClient(Client client){
        return "Your parent/friend " + client.getName() + " doesn't fit the requirements";
    }

    String clientNotFound(){
        return "Client not in database";
    }

    String cantGetCredit(){
        return "You can't get credit";
    }
}
