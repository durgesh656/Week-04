package annotations.create_custom_annotations;

public class TaskManager {
    @TaskInfo(priority = "High",assignedTo = "John")
    public static void taskComplete(){
        System.out.println("Task is done");
    }

    @TaskInfo(priority = "Low" ,assignedTo = "Alice")
    public static void taskSent(){
        System.out.println("Task sent successfully");
    }
}
