import java.util.*;

public class QueueOperations {
    public static void main(String[] args) {
         // Initial Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Compiler");
        queue.add("Firewall");
        queue.add("Algorithm");
        queue.add("Protocol");
        queue.add("Cache");

        System.out.println("Initial Queue: " + queue); 

        //Perform two dequeue operations
        String removed1 = queue.poll();
        String removed2 = queue.poll();
        System.out.println("Dequeued: " + removed1 + ", " + removed2);
        System.out.println("Queue after 2 dequeues: " + queue); 

        //Enqueue "Virtualization"
        queue.add("Virtualization");
        System.out.println("Queue after enqueue 'Virtualization': " + queue);

        //Dequeue once
        String removed3 = queue.poll();
        System.out.println("Dequeued: " + removed3);
        System.out.println("Queue now: " + queue);

        //Enqueue "Cloud"
        queue.add("Cloud");
        System.out.println("Queue after enqueue 'Cloud': " + queue);

        //Check if "Protocol" is present
        boolean containsProtocol = queue.contains("Protocol");
        System.out.println("Is 'Protocol' present? " + (containsProtocol ? "Yes" : "No"));

        //Enqueue "Machine Learning"
        queue.add("Machine Learning");
        System.out.println("Queue after enqueue 'Machine Learning': " + queue);

        //Final dequeue
        String removed4 = queue.poll();
        System.out.println("Dequeued: " + removed4);
        System.out.println("Final Queue: " + queue);

        //Concept check
        System.out.println("From Original Queue:");
        System.out.println("Element at position 3 (Algorithm) was dequeued in Question 3");
        System.out.println("Element at position 4 (Protocol) was dequeued in Question 7"); 
    }
}


