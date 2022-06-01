
/**
 * starting and learning stacks, constructors and object-oriented programming
 * Author Andrew Du-frigstad
 * version 1
 * since 2022-05-17
**/

import java.util.Scanner;

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

            // allow user to ask for what operation they would like to do
            System.out.println("What operation would you like to perform?");
            String answer = myObj.nextLine();
            String answerLower = answer.toLowerCase();

            if (answerLower.equals("push")) {

                while (true) {

                    // make it easier to input multiple numbers
                    System.out.println("How many numbers would you like to push?");
                    String pushAmount = myObj.nextLine();

                    counter = 0;

                    // check if it is positive or a string
                    while (true) {

                        try {
                            numPush = Integer.parseInt(pushAmount);
                            if (numPush >= 0) {
                                break;
                            } else {
                                System.out.println("input a positive number");
                                pushAmount = myObj.nextLine();
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("input a positive number");
                            pushAmount = myObj.nextLine();
                        }
                    }

                    // keep stacking numbers until it reaches the amount set by the user
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
                                } else {
                                    System.out.println("input a positive number");
                                    s = myObj.nextLine();
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("input a positive number");
                                s = myObj.nextLine();
                            }
                        }
                    }
                    break;
                }

            } else if (answerLower.equals("exit")) {

                System.out.println("Finished");
                break;

            } else if (answerLower.equals("peek")) {

                // if it returns the error then display that the stack is empty
                if (otherStack.peek() == -1) {
                    System.out.println("Stack is empty");
                } else {

                    System.out.println(otherStack.peek());
                }

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
                        } else {
                            System.out.println("input a positive number");
                            searchString = myObj.nextLine();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("input a positive number");
                        searchString = myObj.nextLine();
                    }
                }

                otherStack.stackSearch(search);

            } else if (answerLower.equals("pop")) {

                // returns "the stack is empty" when the stakc returns -1 through error checking
                if (otherStack.peek() == -1) {
                    System.out.println("Stack is empty");
                } else {
                    otherStack.pop();
                }

            } else if (answerLower.equals("clear")) {

                otherStack.clear();
                System.out.println("cleared");

            } else {
                System.out.println("That is not a valid input");
            }
        }
    }
}