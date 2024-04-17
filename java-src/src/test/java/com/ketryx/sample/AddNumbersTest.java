package com.ketryx.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddNumbersTest {
    /**
     * Tests that dose is computed correctly.
     * @tests:AddNumbers
     * @itemTitle:"Test Dose Calcuation
     */
    @Test
    public void addNumbersTest() {
        assertEquals(3, AddNumbers.addNumbers(1, 2));
    }
}
