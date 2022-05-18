/**
 * starting and learning stacks, constructors and object-oriented programming
 * Author Andrew Du-frigstad
 * version 1
 * since 2022-05-17
 **/

// imports
import java.util.Stack;

public class MyIntStack {

    // create a class attribute
    Stack<Integer> stack;

    public MyIntStack() {

        // specifies the variable
        this.stack = new Stack<Integer>();

    }

    public Integer pushing(int i) {

        // this acts like .add in a list, pushes the i to the top of the stack
        return this.stack.push(i);
    }

    // always removes the top
    public int remove() {

        // pop is a method that removes the top element
        // returns the thing removed
        return this.stack.pop();
    }

    public int peekyBlinders() {

        // returns element at the top of the stack
        return this.stack.peek();
    }

    public int stackSearch(int search) {

        // FInds element in the stack and returns the index of that element, returns -1
        // if it does not appear
        return this.stack.search(search);
    }

}
