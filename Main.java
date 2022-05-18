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

import javax.swing.text.html.StyleSheet;

public class Main {
    public static void main(String[] args) {

        // create an object of class MyIntStack and print its value
        MyIntStack stupid = new MyIntStack();
        int i = 0;
        int search = 0;

        // getting user input to put to the stack
        Scanner myObj = new Scanner(System.in);

        while (true) {

            System.out.println("What operation would you like to perform?");
            String answer = myObj.nextLine();
            String answerLower = answer.toLowerCase();

            if (answerLower.equals("push")) {

                while (true) {

                    System.out.println("input number");
                    String s = myObj.nextLine();

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

                }

            } else if (answerLower.equals("exit")) {

                System.out.println("Done with this dude, aboslutely finished");
                break;

            } else if (answerLower.equals("peek")) {

                System.out.println(stupid.peekyBlinders());

            } else if (answerLower.equals("search")) {

                System.out.println("input number to search");
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

                if (stupid.stackSearch(search) == -1) {

                    System.out.println("That number does not appear in the list");

                } else {

                    System.out.println("that number appears at " + stupid.stackSearch(search));

                }

            } else if (answerLower.equals("pop")) {
                
                System.out.println(stupid.remove());

            }
        }

        // printing the function from other file
        stupid.pushing(i);
        stupid.remove();

    }
}
