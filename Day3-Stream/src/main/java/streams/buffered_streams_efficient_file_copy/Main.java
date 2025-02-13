package streams.buffered_streams_efficient_file_copy;

public class Main {
    public static void main(String[] args) {
        String source = "src/main/java/streams/buffered_streams_efficient_file_copy/source.txt";
        String destinationBuffered = "src/main/java/streams/buffered_streams_efficient_file_copy/destinationBuffered.txt";
        String destinationUnBuffered = "src/main/java/streams/buffered_streams_efficient_file_copy/destinationUnBuffered.txt";


        // Copy using buffered streams
        long bufferedTime = EfficientFileCopy.copyWithBufferedStreams(source, destinationBuffered);
        System.out.println("Buffered Streams Execution Time  : " + bufferedTime + " ns");

        // Copy using unbuffered streams
        long unbufferedTime = EfficientFileCopy.copyWithUnbufferedStreams(source, destinationUnBuffered);
        System.out.println("Unbuffered Streams Execution Time: " + unbufferedTime + " ns");


    }

}
