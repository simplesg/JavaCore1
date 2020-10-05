package Task1;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        int sumOfDigits = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000");
        int number = Integer.parseInt(input.next());
        if(number < 0 || number > 1000){
            System.out.println("Invalid input!");
        } else{
            int numbers = number;
            while(number > 0){
                sumOfDigits = sumOfDigits + number % 10;
                number = number / 10;
            }
            System.out.println("The sum of all digits in " + numbers + " is " + sumOfDigits);
        }

    }
}
