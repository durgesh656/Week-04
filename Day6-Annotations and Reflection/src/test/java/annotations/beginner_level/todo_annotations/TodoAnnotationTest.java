package annotations.beginner_level.todo_annotations;

import annotations.beginner_level.todo_annotation.Todo;
import annotations.beginner_level.todo_annotation.TodoManager;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TodoAnnotationTest {
    @Test
    void checkOutput(){
        Class<TodoManager> taskInfo = TodoManager.class;

        for (Method method : taskInfo.getDeclaredMethods()){
            Todo todoInfo = method.getAnnotation(Todo.class);
            if (method.isAnnotationPresent(Todo.class)){
                assertNotNull(todoInfo.assignedInfo());
                assertNotNull(todoInfo.priority());
                assertNotNull(todoInfo.task());
            }
        }

    }
}
