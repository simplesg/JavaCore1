package Core1Tasks.Task6.Task5;

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

    public int[] sortAsc(int[] array) {
        int k = 0;
        int[] newArray = new int[array.length];       // array that holds only the min values for each iteration

        for (int i = 0; i < array.length; i++) {
            int min = 9999;
            int[] tempArray = new int[array.length - i];          //array that holds the values without the min one
            for (int x = 0; x < tempArray.length; x++) {          //assign the values to tempArray
                tempArray[x] = array[x + i];                      //each iteration of i tempArray holds -1 value
            }

            for (int j = 0; j < tempArray.length; j++) {
                if (tempArray[j] < min) {
                    min = tempArray[j];                           //checking the min value
                    k = j;                                        //saving the index of the min value
                }

            }
            reverse(tempArray, k + 1);
            for (int y = 0, z = i; y < tempArray.length; y++, z++) {        //ordering the values
                array[z] = tempArray[y];
            }
            newArray[i] = tempArray[0];         //adding the min value to the array
        }
        return newArray;
    }

    public int[] sortDesc(int[] array) {
        int k = 0;
        int[] newArray = new int[array.length];       // array that holds only the min values for each iteration

        for (int i = 0; i < array.length; i++) {
            int max = -99999;
            int[] tempArray = new int[array.length - i];          //array that holds the values without the min one
            for (int x = 0; x < tempArray.length; x++) {          //assign the values to tempArray
                tempArray[x] = array[x + i];                      //each iteration of i tempArray holds -1 value
            }

            for (int j = 0; j < tempArray.length; j++) {
                if (tempArray[j] > max) {
                    max = tempArray[j];                           //checking the max value
                    k = j;                                        //saving the index of the max value
                }

            }
            reverse(tempArray, k + 1);
            for (int y = 0, z = i; y < tempArray.length; y++, z++) {        //ordering the values
                array[z] = tempArray[y];
            }
            newArray[i] = tempArray[0];         //adding the min value to the array
        }
        return newArray;
    }

    public static void main(String[] args) {
        ArraysPractice arraysPractice = new ArraysPractice();

        while (true) {
            System.out.println("Give the length of array: ");
            Scanner scanner = new Scanner(System.in);
            int arrayLength = Integer.parseInt(scanner.next());
            int[] integers = new int[arrayLength];
            System.out.println("Give the array: ");

            for (int i = 0; i < arrayLength; i++) {
                integers[i] = scanner.nextInt();
            }

            System.out.println("--------------------------------");
            System.out.println("Sorted array in Asc order");
            for (int number : arraysPractice.sortAsc(integers)) {
                System.out.print(number + "  ");
            }
            System.out.println("");
            System.out.println("--------------------------------");
            System.out.println("Sorted array in Desc");
            for (int number : arraysPractice.sortDesc(integers)) {
                System.out.print(number + "  ");
            }
            System.out.println("");
            System.out.println("--------------------------------");
            System.out.println("Enter any String to continue OR 'EXIT' to quit");
            String decision = scanner.next();
            if (decision.equals("EXIT")) {
                break;
            }
        }


    }
}