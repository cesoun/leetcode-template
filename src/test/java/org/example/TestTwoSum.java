package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestTwoSum {

    /**
     * Internal class to define our test case structure
     */
    private class TestCase {
        public int[] nums, want;
        public int target;

        public TestCase(int[] nums, int target, int[] want) {
            this.nums = nums;
            this.target = target;
            this.want = want;
        }
    }

    // ArrayList of all our tests.
    private ArrayList<TestCase> tests;

    /**
     * Initialize our test cases here.
     */
    @BeforeAll
    void init() {
        tests = new ArrayList<>();

        tests.add(new TestCase(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}));
        tests.add(new TestCase(new int[]{3, 2, 4}, 6, new int[]{1, 2}));
        tests.add(new TestCase(new int[]{3, 3}, 6, new int[]{0, 1}));
    }

    /**
     * Test the implementation
     */
    @Test
    void twoSum() {
        TwoSum ts = new TwoSum();

        for (TestCase t : tests) {
            assertArrayEquals(t.want, ts.twoSum(t.nums, t.target));
        }
    }
}
