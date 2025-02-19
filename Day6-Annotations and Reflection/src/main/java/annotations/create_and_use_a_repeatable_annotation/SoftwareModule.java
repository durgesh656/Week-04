package annotations.create_and_use_a_repeatable_annotation;

public class SoftwareModule {
    @BugReport(description = "NullPointerException occurs", reportedBy = "John", severity = "High")
    @BugReport(description = "IOException occurs", reportedBy = "Rahul")
    public void processData(){
        System.out.println("Processing Data....");
    }
}
