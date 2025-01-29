package sampleproblemsforstacksandqueues.implementaqueueusingstacks;
import java.util.*;
//creating class to perferm queue operations using stack
public class ImplementAQueueUsingStacks {

    //declairing two stacks to perform queue operations
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int n) {
        stack1.push(n);  // Corrected to use variable name 'n' instead of 'x'
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return stack2.pop();  // Corrected stack2.pop() instead of stack1.pop()
    }

    void display() {
     System.out.println("Stack elements:");
        for(
     int element :stack1)
        {
        System.out.println(element);
    }
}
}