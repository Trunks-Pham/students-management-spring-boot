package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    void helloWorld() {
        assertEquals("Hello, World!", "Hello, World!");
    }
}