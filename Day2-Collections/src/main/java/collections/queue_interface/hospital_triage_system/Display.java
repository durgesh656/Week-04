package collections.queue_interface.hospital_triage_system;

import java.util.PriorityQueue;

public class Display {
    // Method to display the patients
    public static void display(PriorityQueue<Patient> queue){
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+"  ");
        }
    }
}
