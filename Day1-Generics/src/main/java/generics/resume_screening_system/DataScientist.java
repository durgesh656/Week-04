package generics.resume_screening_system;

import java.util.ArrayList;
import java.util.Arrays;

public class DataScientist extends JobRole{

    // specifying required skills while creating a constructor
    public DataScientist(){
        super("Data Scientist", new ArrayList<>(Arrays.asList("Python", "PowerBI", "Visual Basics")));
    }
}