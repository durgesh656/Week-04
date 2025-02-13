package collections.queue_interface.implement_stack_using_queues;

public class Main {
    public static void main(String[] args) {
        ImplementStackUsingQueue s = new ImplementStackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek element of stack is: "+s.peek());
        System.out.println("Pop top element of a stack: "+s.pop());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
