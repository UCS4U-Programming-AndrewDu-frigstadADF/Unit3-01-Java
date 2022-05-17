/**
 * starting and learning stacks, constructors and object-oriented programming
 * Author Andrew Du-frigstad
 * version 1
 * since 2022-05-17
**/

// imports
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        int search = 0;

        // getting user input to put to the stack
        Scanner myObj = new Scanner(System.in);
        System.out.println("input number");
        String s = myObj.nextLine();

        while (true) {

            // if the user inputs a number less than 0 then tell them to input a positive
            // number
            try {
                i = Integer.parseInt(s);
                if (i >= 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("input a positive number");
            }
            s = myObj.nextLine();
        }

        System.out.println("input place to search");
        String searchString = myObj.nextLine();

        while (true) {

            // if the user inputs a number less than 0 then tell them to input a positive
            // number
            try {
                search = Integer.parseInt(searchString);
                if (search >= 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("input a positive number");
            }
            searchString = myObj.nextLine();
        }

        // create an object of class MyIntStack and print its value
        MyIntStack stupid = new MyIntStack();

        // printing the function from other file
        stupid.pushing(i);
        stupid.peekyBlinders();
        stupid.remove();
        stupid.stackSearch(search);

    }
}
