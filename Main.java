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
        MyIntStack otherStack = new MyIntStack();
        int i = 0;
        int search = 0;
        int numPush = 0;
        int counter = 0;

        // getting user input to put to the stack
        Scanner myObj = new Scanner(System.in);

        while (true) {

            System.out.println("What operation would you like to perform?");
            String answer = myObj.nextLine();
            String answerLower = answer.toLowerCase();

            if (answerLower.equals("push")) {

                while (true) {

                    System.out.println("How many numbers would you like to push?");
                    String pushAmount = myObj.nextLine();

                    while (true) {

                        try {
                            numPush = Integer.parseInt(pushAmount);
                            if (numPush >= 0) {
                                System.out.println(numPush);
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("input a positive number");
                        }
                    }

                    while (numPush != counter) {

                        counter = counter + 1;

                        System.out.println("input number");
                        String s = myObj.nextLine();

                        // if the user inputs a number less than 0 then tell them to input a positive
                        // number
                        while (true) {

                            try {
                                i = Integer.parseInt(s);
                                if (i >= 0) {
                                    otherStack.push(i);
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("input a positive number");
                            }
                        }

                        if (numPush == counter) {
                            break;
                        }
                    }

                }

            } else if (answerLower.equals("exit")) {

                System.out.println("Finished");
                break;

            } else if (answerLower.equals("peek")) {

                System.out.println(otherStack.peek());

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

                if (otherStack.stackSearch(search) == -1) {

                    System.out.println("That number does not appear in the list");

                } else {

                    System.out.println("that number appears at " + otherStack.stackSearch(search));

                }

            } else if (answerLower.equals("pop")) {

                System.out.println(otherStack.pop());

            } else {
                System.out.println("That is not a valid input");
            }
        }

        // printing the function from other file
        otherStack.push(i);
        otherStack.pop();

    }
}