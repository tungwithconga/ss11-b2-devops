package com.example.ss11b1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {
    @Test
    void helloReturnsExpectedMessage() {
        HelloController controller = new HelloController();
        assertEquals("Hello from ss11-b1!", controller.hello());
    }
}
