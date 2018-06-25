package com.png.kpicomputation.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class KPIComputationControllerTest {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        KPIComputationController controller = new KPIComputationController();

       assertEquals(3,controller.forUnitTesting());
    }

}