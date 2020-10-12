package Core1Tasks.Task6.Task2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Input a string: ");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        String reversedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            reversedMessage = message.charAt(i) + reversedMessage;
        }
        System.out.println(reversedMessage);
    }
}
