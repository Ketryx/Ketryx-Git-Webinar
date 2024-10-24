package com.ketryx.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoseCalculationTest {
    /**
     * Tests that the dose is computed correctly.
     * @tests:DoseCalculation
     * @itemTitle:"Test the Dose Calculation"
     */
    @Test
    public void doseCalculationTest() {
        assertEquals(3, DoseCalculation.calculateDose(1, 2));
    }
}
