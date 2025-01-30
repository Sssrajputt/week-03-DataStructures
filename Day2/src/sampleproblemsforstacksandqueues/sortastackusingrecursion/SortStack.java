package sampleproblemsforstacksandqueues.sortastackusingrecursion;
import java.util.Stack;

public class SortStack {
    // Function to insert element at correct position in sorted stack
    public static void sortedInsert(Stack<Integer> stack, int element) {
        // Base case: Either stack is empty or top of stack is smaller than element
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
        } else {
            // Remove the top element
            int temp = stack.pop();
            // Recur for the remaining stack
            sortedInsert(stack, element);
            // Insert the top element back
            stack.push(temp);
        }
    }

    // Function to sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        // Base case: Stack is empty
        if (!stack.isEmpty()) {
            // Remove the top element
            int temp = stack.pop();
            // Sort the remaining stack
            sortStack(stack);
            // Insert the top element back in sorted order
            sortedInsert(stack, temp);
        }
    }
}
