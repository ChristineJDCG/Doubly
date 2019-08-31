/*
 *Names: GONZALES, Christine Joy D.
 *       TAPEC, Deanne Ruth L.
 *       TAYABA, Andrea Gale M.
 *CLASSCODE & Schedule: 9391 9:30-11:00 TF
 *Start Date: August 23, 2019
 *Instructor: Roderick Makil
 *
 *Problem:
 *      Write a program that
 *
 *Algorithm:
 **/

import java.util.Scanner;
public class Milestones {

    public static void Main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose status of the project:\t"+
                "A. Finished Projects\t"+
                "B. Unfinished Projects");
        char status= sc.next().toUpperCase().charAt(0);
        switch(status){
            case 'A':
                //List of finished projects use .get
                break;
            case 'B':
                //List of unfinished projects
                break;
            default:
                System.exit(0);
        }
    }
}
