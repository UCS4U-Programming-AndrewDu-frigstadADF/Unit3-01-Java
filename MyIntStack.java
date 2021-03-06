/**
 * starting and learning stacks, constructors and object-oriented programming
 * Author Andrew Du-frigstad
 * version 1
 * since 2022-05-17
 **/

// imports
import java.util.EmptyStackException;
import java.util.Stack;

public class MyIntStack {

    // create a class attribute
    Stack<Integer> stack;

    public MyIntStack() {

        // specifies the variable
        this.stack = new Stack<Integer>();

    }

    public void push(int i) {

        // this acts like .add in a list, pushes the i to the top of the stack
        this.stack.push(i);
    }

    // always removes the top
    public int pop() {

        // pop is a method that removes the top element
        // returns the thing removed
        try {
            int temp = this.stack.pop();
            System.out.println("popped " + temp);
            return temp;
        } catch (EmptyStackException e) {
            return -1;
        }
    }

    public int peek() {

        // returns element at the top of the stack
        try {
            int peekNum = (int) stack.peek();
            System.out.println("element is " + peekNum);
            return peekNum;
        } catch (EmptyStackException e) {
            return -1;
        }

    }

    public int stackSearch(int search) {

        // FInds element in the stack and returns the index of that element, returns -1
        // if it does not appear
        int searchNum = (int) stack.search(search);

        if (searchNum == -1) {
            System.out.println("That number does not appear in the stack");
        } else {
            System.out.println(search + " is at index " + searchNum);
        }

        return searchNum;
    }

    public void clear() {

        // clears the stack
        this.stack.clear();
    }

}
