package generics.resume_screening_system;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ResumeScreeningSystemTest {
    // creating softwareEngineer object initialize the requiredSkills
    SoftwareEngineer softwareEngineer = new SoftwareEngineer();
    Resume<SoftwareEngineer> resume1 = new Resume<>("Person1", new ArrayList<>(Arrays.asList("Java", "SpringBoot", "Angular", "JUnit")), softwareEngineer);

    // creating dataScientist object initialize the requiredSkills
    DataScientist dataScientist = new DataScientist();
    Resume<DataScientist> resume2 = new Resume<>("Person2", new ArrayList<>(Arrays.asList("Python", "PowerBI", "Visual Basics", "Java")), dataScientist);

    // creating productManager object initialize the requiredSkills
    ProductManager productManager = new ProductManager();
    Resume<ProductManager> resume3 = new Resume<>("Person3", new ArrayList<>(Arrays.asList("AWS", "Project management Tools", "Testing")), productManager);

    // creating a false test case
    Resume<ProductManager> resume4 = new Resume<>("Person4", new ArrayList<>(Arrays.asList("Project management Tools", "Testing")), productManager);


    @Test
    void test1(){
        assertEquals("Person1",resume1.name);
        assertEquals("AWS",resume3.skills.getFirst());

    }

    @Test
    void test2(){//Test 2 fails because for resume3 first skill is "AWS"
        assertNotEquals("AWS",resume3.skills.getFirst());
    }
}

