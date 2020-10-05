package Task5;

import java.util.Arrays;

public class ArraysPractice {
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
         return Arrays.stream(array).sorted().toArray();
    }

    public static void main(String[] args) {
        ArraysPractice arraysPractice = new ArraysPractice();
        int[] integers = new int[]{ 1,2,3,4,5,6,7,8 };
        int[] newIntegers = arraysPractice.reverse(integers,5);
        for (int number: newIntegers) {
            System.out.println(number);
        }
    }
}
