package generics.university_course_management_system;

public class ExamCourse extends CourseType{
    // overriding the setter method of CourseType class
    @Override
    public void setCourseAttributes(String name, int durationInMonths){
        this.name = name;
        this.durationInMonths = durationInMonths;
        this.type = "Exam Course";
    }
}
