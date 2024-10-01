package com.campusdual.classroom;

import java.util.Iterator;
import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Smith");
        stringStack.push("Montessori");
        stringStack.push("Peralta");
        stringStack.push("House");
        return stringStack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        printAndEmptyStack(createStack());
    }



}
