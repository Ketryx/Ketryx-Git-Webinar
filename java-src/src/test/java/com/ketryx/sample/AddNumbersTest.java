package com.ketryx.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddNumbersTest {
    /**
     * Tests that two numbers can be added correctly.
     * @tests:AddNumbers
     */
    @Test
    public void addNumbersTest() {
        assertEquals(3, AddNumbers.addNumbers(1, 2));
    }
}
