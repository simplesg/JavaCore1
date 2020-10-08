package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

    public int[] reverse(int[] array, int k) {
        if (k > array.length || k < 0) {
            System.out.println("Invalid range!");
        }
        if (k == 0) {
            return array;
        }

        for (int i = 0; i < k / 2; i++) {
            int j = array[i];
            array[i] = array[k - i - 1];
            array[k - i - 1] = j;
        }
        return array;
    }

    public int[] sort(int[] array) {
        int k = 0;
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int min = 9999;
            int[] tempArray = new int[array.length - i];
            for (int x = 0; x < tempArray.length; x++) {
                tempArray[x] = array[x + i];
            }

            for (int j = 0; j < tempArray.length; j++) {
                if (tempArray[j] < min) {
                    min = tempArray[j];
                    k = j;
                }

            }
            reverse(tempArray, k + 1);
            for (int y = 0, z = i; y < tempArray.length; y++, z++) {
                array[z] = tempArray[y];
            }
            newArray[i] = tempArray[0];
        }
        return newArray;
    }

    public static void main(String[] args) {
        ArraysPractice arraysPractice = new ArraysPractice();
//        int[] integers = new int[]{ 1,2,3,4,5,6,7,8 };
        while (true) {
            System.out.println("Give the length of array: ");
            Scanner scanner = new Scanner(System.in);
            int arrayLength = Integer.parseInt(scanner.next());
            int[] integers = new int[arrayLength];
            System.out.println("Give the array: ");

            for (int i = 0; i < arrayLength; i++) {
                integers[i] = scanner.nextInt();
            }
//            System.out.println("Give the range from which to reverse: ");
//            int range = scanner.nextInt();

//            int[] newIntegers = arraysPractice.reverse(integers, range);
//
//            for (int number : newIntegers) {
//                System.out.print(number + "  ");
//            }
            System.out.println("");
            int[] sortedArray = arraysPractice.sort(integers);
            for (int number : sortedArray) {
                System.out.print(number + "  ");
            }

            System.out.println("Enter Y to continue & EXIT to quit");
            String decision = scanner.next();
            if (decision.equals("EXIT")) {
                break;
            }
        }


    }
}