package annotations.beginner_level.todo_annotation;

public class TodoManager {
    // method in which annotation is applied

    @Todo(task = "Complete the UI" , assignedInfo = "John",priority = "High")
    public static void pendingTask(){
        System.out.println("Pending task");
    }
    @Todo(task = "Complete the Login/SignUp Feature" , assignedInfo = "Alice",priority = "lOW")
    public static void completedTask(){
        System.out.println("Completed Task");
    }
    @Todo(task = "Complete the Concurrency" , assignedInfo = "Bob",priority = "High")
    public static void submittedTask(){
        System.out.println("Pending task");
    }
}
