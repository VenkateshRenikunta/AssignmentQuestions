// Java program to arrange given array x in a wave form
// Array such as arr [1]> = arr [2] <= arr [/]> = arr [4] <= arr [5] .... ....

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {

    // Create a method to swap elements of array to get final form
    public static void Swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] waveArray(int[] arr){
        // Sorting the array before swapping the elements
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-1; i++) {
            // creating a loop to swap the elements
            // Swap the odd elements with next element such as (0-1, 2-3. 3-4. ....)
            System.out.println("i "+i);
            Swap(arr, i, ++i);
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] array = new int[num];
        for(int i=0; i<num; i++){
            array[i] = s.nextInt();
        }
        System.out.println("Given Array: "+Arrays.toString(array));
        System.out.println("\nFinal Array: "+Arrays.toString(waveArray(array)));
    }
}
