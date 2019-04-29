package interviewTopics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGen {

    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
        }
        //System.out.println(Arrays.toString(arr));  // printing each array element
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // printing each array element

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your n'th number: ");
        int k = in.nextInt();


        System.out.print( "nth smallest element is: "+ arr [k-1]);


    }


}
