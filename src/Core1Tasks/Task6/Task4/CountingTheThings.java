package Core1Tasks.Task6.Task4;

import java.util.Scanner;

public class CountingTheThings {
    public void count(String input){
        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int others = 0;
        char[] stringArray = input.toCharArray();

        for (Character symbol : stringArray) {
            if(Character.isDigit(symbol)){
                numbers++;
            }
            else if(Character.isLetter(symbol)){
                letters++;
            }
            else if(Character.isWhitespace(symbol)){
                spaces++;
            }
            else{
                others++;
            }
        }
        System.out.println("letters: " + letters);
        System.out.println("numbers: " + numbers);
        System.out.println("spaces: " + spaces);
        System.out.println("others: " + others);


    }

    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        CountingTheThings newCounting = new CountingTheThings();
        newCounting.count(sentence);
    }
}
