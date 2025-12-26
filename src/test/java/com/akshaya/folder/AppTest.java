package com.akshaya.folder;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppIT {

    @Test
    void testMainExecution() {
        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            // Call main method (integration context)
            App.main(new String[]{});

            // Verify output contains expected content
            String output = outContent.toString();
            assertTrue(output.length() > 0, "Main method should print something");

        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }
}
