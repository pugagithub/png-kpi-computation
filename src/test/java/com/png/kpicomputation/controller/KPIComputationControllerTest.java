package com.png.kpicomputation.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class KPIComputationControllerTest {

    @Test
    public void dummyTest() {
        KPIComputationController controller = new KPIComputationController();

       assertEquals(2,controller.forUnitTesting());
    }

}