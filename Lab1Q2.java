
//The program asks user to enter array of size, asks user to enter elements of the array, asks user to enter "how many times will you shift" and shifts elements of the array to the right.

import java.util.*;
public class Lab1Q2 {
    public static void main(String[]args){
        Scanner console = new Scanner(System.in);

        System.out.print("How many number will you enter?: ");
        int numberofenter = console.nextInt();

        int[] arrayofnumber = new int[numberofenter];

        System.out.print("How many times will you shifts elements of the array to the right?: ");
        int shifttimes = console.nextInt();

        for(int i = 0 ; i < numberofenter ; i++ ){
            System.out.print((i+1) + "- ");
            arrayofnumber[i] = console.nextInt();
        }

        System.out.println();

        for (int i = 0 ; i < shifttimes ; i++)
            arrayofnumber = Shifting(arrayofnumber, shifttimes);

        for(int i = 0 ; i < numberofenter ; i++)
            System.out.println((i+1)+ "- " + arrayofnumber[i]);
    }

    public static int[] Shifting (int[] array, int st){
        int[] array1 = new int[array.length];

            int lastelement = array[(array.length) - 1];
            for (int x = 0; x < array1.length-1; x++) {
                array1[x + 1] = array[x];
            }
            array1[0] = lastelement;

        return array1;
    }

}
