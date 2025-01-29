package sampleproblemsforstacksandqueues.implementaqueueusingstacks;
import java.util.*;
public class Main{
    public static void main(String args[]) {
        //creating object of ImplementAQueueUsingStacks class
        ImplementAQueueUsingStacks stacks = new ImplementAQueueUsingStacks();
        System.out.println("performing enque");
        //calling enque method
        stacks.enqueue(10);
        stacks.enqueue(20);
        stacks.enqueue(30);

        //displaying the stack elements
        stacks.display();

        System.out.println("-----------------------------");
        System.out.println("Dequeued element: " + stacks.dequeue());  // Added print statement for the dequeued element
        //displaying after deque
        System.out.println("-----------------------------");
        stacks.display();


    }
}