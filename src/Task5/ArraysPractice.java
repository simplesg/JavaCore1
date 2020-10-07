package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static int rangeK = 0;    // added static public variable to store the range value of when to sort the array

    public int[] reverse(int[] array, int k){
        if(k > array.length){
            System.out.println("Invalid range!");
        }

        for (int i = 0; i < k/2; i++) {
            int j = array[i];
            array[i] = array[k - i - 1];
            array[k - i - 1] = j;
            
        }
//        for (int number: array) {
//            System.out.println(number);
//        }
        return array;
    }

    public int[] sort(int[] array){
//         return Arrays.stream(array).sorted().toArray();
        return reverse(array, rangeK);
    }

    public static void main(String[] args) {
        ArraysPractice arraysPractice = new ArraysPractice();
//        int[] integers = new int[]{ 1,2,3,4,5,6,7,8 };
        System.out.println("Give the length of array: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = Integer.parseInt(scanner.next());
        int[] integers = new int[arrayLength];
        System.out.println("Give the array: ");

        for (int i = 0; i < arrayLength; i++) {
            integers[i] = scanner.nextInt();
        }
        System.out.println("Give the range from which to sort: ");
        int range = scanner.nextInt();
        rangeK = range;

        int[] newIntegers = arraysPractice.reverse(integers,range);

        for (int number: newIntegers) {
            System.out.println(number);
        }
        System.out.println("Sorted array: ");
        newIntegers = arraysPractice.sort(newIntegers);

        for (int number: newIntegers) {
            System.out.println(number);
        }

    }
}
