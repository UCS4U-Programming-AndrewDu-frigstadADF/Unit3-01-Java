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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // getting user input to put to the stack
        Scanner myObj = new Scanner(System.in);
        System.out.println("input number");
        String i = myObj.nextLine();

        // create an object of class MyIntStack and print its value
        MyIntStack gd = new MyIntStack();

        // printing the function from other file
        gd.pushing(7);
        gd.peek();

    }
}
