package collections.queue_interface.circular_buffer_simulation;

public class Main {
    public static void main(String[] args) {
        CircularBuffer circularBuffer = new CircularBuffer(3);

        circularBuffer.insert(1);
        circularBuffer.insert(2);
        circularBuffer.insert(3);
        circularBuffer.printBuffer();
        circularBuffer.insert(4);
        circularBuffer.printBuffer();
    }

}
