package streams.data_streams_store_and_retrieve_primitive_data;

import java.io.Serializable;

public class Student  {
    int rollNumber;
    String name;
    double gpa;

    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }
}
