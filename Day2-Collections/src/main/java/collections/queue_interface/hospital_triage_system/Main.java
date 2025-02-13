package collections.queue_interface.hospital_triage_system;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> triage = new PriorityQueue<>((p1, p2)-> p2.severity - p1.severity);

        // Add the patients to the hospital
        triage.add(new Patient("John" , 3));
        triage.add(new Patient("Alice" , 5));
        triage.add(new Patient("Bob" , 2));


        // Display the queue
        Display.display(triage);
    }

}
