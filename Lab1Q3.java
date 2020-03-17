
//The program asks user to enter of array size and give random elements, the method removes the element of the array at the given index and returns.

import java.util.*;
public class Lab1Q3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("How many number will you enter?: ");
        int sizeofarray = console.nextInt();

        double[] Array= new double[sizeofarray];

        for(int i = 0 ; i < sizeofarray ; i++) {
            Array[i] = Math.random() * 100;
            System.out.println((i+1) + "- " + Array[i]);
        }

        System.out.print("Which step will you delete?: ");
        int delete = console.nextInt();

        double[] newArray = removeMember(Array,delete);

        for(int i = 0 ; i < newArray.length ; i++)
            System.out.println((i+1) + "- " + newArray[i]);
    }

    public static double[] removeMember (double[] a, int idx){
       double[] newA = new double[(a.length)-1];
       int j = 0;
        for(int x = 0 ; x < a.length ; x++){
            if((x+1) != idx){
                newA[j]=a[x];
                j++;
            }
        }
        return newA;
    }
}
