import java.util.Stack;
// In stack we are  only one side as we peek element it should be latest we added to the stack and added element is also the latest element 
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        
        System.out.println("Stack: " + stack);
        
        // Peek at the top element
        System.out.println("Top element: " + stack.peek());
        
        // Pop the top element
        stack.pop();
        System.out.println("After pop: " + stack);
    }
}
