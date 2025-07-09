import java.util.*;

public class StackExample {
    static class Stack {
        private List<Integer> items;

        // Constructor
        public Stack() {
            items = new ArrayList<>();
        }

        // Push operation
        public void push(int item) {
            items.add(item);
            System.out.println("Pushed: " + item);
        }

        // Pop operation
        public Integer pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return null;
            }
            return items.remove(items.size() - 1);
        }

        // Peek operation
        public Integer peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return null;
            }
            return items.get(items.size() - 1);
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return items.isEmpty();
        }

        // Get stack size
        public int size() {
            return items.size();
        }

        // Display stack from top to bottom
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
            } else {
                System.out.println("Stack (top to bottom):");
                for (int i = items.size() - 1; i >= 0; i--) {
                    System.out.println(items.get(i));
                }
            }
        }

        // Clear the stack
        public void clear() {
            items.clear();
            System.out.println("Stack cleared.");
        }
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        s.display();

        System.out.println("Stack size: " + s.size());
        s.clear();
        s.display();
    }
}
