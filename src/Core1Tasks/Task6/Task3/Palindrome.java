package Core1Tasks.Task6.Task3;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(int number){
        int reversedNumber = 0;
        int originalNumber = number;
        while(number != 0){
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return originalNumber == reversedNumber;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInput = Integer.parseInt(input.next());
        Palindrome newPalindrome = new Palindrome();
        System.out.println(newPalindrome.isPalindrome(numberInput));

    }
}
