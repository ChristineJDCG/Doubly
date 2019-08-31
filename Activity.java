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

import java.io.File;
import java.util.Scanner;

public class Activity{
    public static void main(String[] args) throws Exception{
        OLinkedList<String>  oLinkedList = new OLinkedList<String>();
        Scanner sc = new Scanner(new File("D:\\9391-prelim-grp03\\src\\Projects"));
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        oLinkedList.addAtTail("ListTest");
    }
}


























/*import java.util.Scanner;

public class Activity{
    public static void Main(String []args){
        System.out.println("Categories:" +
                "\n"+ "A. Your Projects" +
                "\n"+ "B. Starred Projects" +
                "\n"+ "C. Members");
        Scanner sc = new Scanner(System.in);
        char ans = sc.next().charAt(0);
        switch (ans){
            case 'A':
                /*code actions
                    LIST:
                        push events
                        merge events
                        */
           /* case 'B':
                /*code actions
                    LIST:
                        push events
                        merge events
                        */
          /*  case 'C':
                //list of members
        }
    }
}*/