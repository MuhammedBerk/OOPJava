
//The program reads number of students and each students score from the user, computes the best score and assigns letter grades according to the following scale.

import java.util.*;
public class Lab1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("How many score will you enter?: ");
        int scorenum = console.nextInt();

        double[] score = new double[scorenum];
        double bestscore=0;

        char Grade;

        for(int i=0 ; i < scorenum ; i++) {
            System.out.print("Student " + (i+1) + ": ");
            score[i]=console.nextDouble();
            if(score[i]>bestscore)
                bestscore=score[i];
        }

        for(int i=0 ; i < scorenum ; i++) {
            if(score[i]>=bestscore-10) {
                Grade = 'A';
                System.out.println("Student " + (i+1) + "'s Letter Grade: " + Grade);
            }
			else if(score[i]>=bestscore-20) {
                Grade = 'B';
                System.out.println("Student " + (i+1) + "'s Letter Grade: " + Grade);
            }
			else if(score[i]>=bestscore-30) {
                Grade = 'C';
                System.out.println("Student " + (i+1) + "'s Letter Grade: " + Grade);
            }
			else if(score[i]>=bestscore-40) {
                Grade = 'D';
                System.out.println("Student " + (i+1) + "'s Letter Grade: " + Grade);
            }
			else {
                Grade = 'f';
                System.out.println("Student " + (i+1) + "'s Letter Grade: " + Grade);
            }
        }
    }
}
