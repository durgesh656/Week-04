package streams.serialization_save_and_retrieve_an_object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Employee list to add the information in the ser file
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Durgesh","id1","HR",100000));
        employee.add(new Employee("Om ","id2","CSE",50000));
        employee.add(new Employee("Bipin","id3","HR",50000));
        employee.add(new Employee("harsh","id4","MR",70000));

        // Creating the file path
        String fileName = "employee_info.txt";
        String currentPath = "src/main/java/streams/serialization_save_and_retrieve_an_object/";
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentPath + fileName))) {
            oos.writeObject(employee);
            System.out.println("Employee list has been serialized");

        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found exception occurred please enter the correct path of the file");
        }catch (IOException e){
            System.out.println("IO EXCEPTION OCCURRED " + e.getMessage());
        }

        // Deserializable employee file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentPath + fileName))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employee List:");
            for (Employee emp : employees) {
                emp.displayEmployeeDetails();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error occurred during deserialization.");
        }
    }

}
