package reflection.advance_problems.dependency_injection;

import org.junit.jupiter.api.Test;
import reflection.advance_problems.dependecy_injection.DIContainer;
import reflection.advance_problems.dependecy_injection.UserController;

import static org.junit.jupiter.api.Assertions.*;

public class DIContainerTest {

    @Test
    void testDependencyInjection() {
        try {
            DIContainer container = new DIContainer();
            UserController userController = container.getInstance(UserController.class);

            assertNotNull(userController, "UserController instance should not be null!");
            assertNotNull(userController.getService(), "Service should be injected!");

            // Simulate sending a message
            userController.sendNotification();
        } catch (Exception e) {
            fail("Error occurred exception caught" + e.getMessage());
        }
    }
}

