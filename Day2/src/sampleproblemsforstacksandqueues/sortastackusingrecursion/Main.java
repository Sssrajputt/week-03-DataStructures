package sampleproblemsforstacksandqueues.sortastackusingrecursion;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        SortStack sortStack = new SortStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original stack: " + stack);
        sortStack.sortStack(stack);
        System.out.println("Sorted stack: " + stack);
    }
}
