package streams.bytearray_stream_convert_image_to_bytearray;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String sourceImagePath = "src/main/java/streams/bytearray_stream_convert_image_to_bytearray/source.jpg";
        String destinationImagePath = "src/main/java/streams/bytearray_stream_convert_image_to_bytearray/copied.jpg";

        try {
            // Convert image to byte array
            byte[] imageBytes = ConvertImageToByteArrayAndByteArrayToImage.convertImageToByteArray(sourceImagePath);
            System.out.println("Image successfully converted to byte array.");

            // Write byte array back to an image file
            ConvertImageToByteArrayAndByteArrayToImage.writeByteArrayToImage(imageBytes, destinationImagePath);
            System.out.println("Byte array successfully written to new image file.");

        } catch (IOException e) {
            System.out.println("Exception caught" + e.getMessage());
        }
    }

}
