package com.ketryx.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoseCalculationTest {
    /**
     * Tests that the dose is computed correctly.
     * @tests:DoseCalculation
     * @itemTitle:"Test Dose Calculation"
     */
    @Test
    public void doseCalculationTest() {
        assertEquals(3, DoseCalculation.calculateDose(1, 2));
        assertEquals(10, DoseCalculation.calculateDose(2, 5));
    }
}
