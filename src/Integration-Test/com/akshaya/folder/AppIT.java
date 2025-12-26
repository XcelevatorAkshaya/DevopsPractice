package com.example.integration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceIT {

    @Test
    void testUserCreationWithDatabase() {
        // Setup database or use an in-memory database like H2
        UserService userService = new UserService();

        User user = new User("Akshaya", "akshaya@example.com");
        userService.save(user);

        User fetched = userService.findByEmail("akshaya@example.com");
        assertNotNull(fetched);
        assertEquals("Akshaya", fetched.getName());
    }
}
