package edu.devybh.leetcode.solutions;

import edu.devybh.leetcode.Util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_0001_TwoSum extends AbstractSolution {

    public int[] twoSum(int[] nums, int target) {
        Util.log(Arrays.toString(nums));
        return new int[]{1, 2};
    }


    @Override
    public TestCase[] getTestCases() {
        ArrayList<TestCase> testCases = new ArrayList<TestCase>();

        // 문제1
        TestCase testCase = new TestCase();
        testCase.input = new Class[]{Array.class, int.class};

        int[] param1 = new int[]{0,1};
        int param2 = 9;

        testCase.output = new Object[]{param1,param2};
        testCases.add(testCase);

        return testCases.toArray(TestCase[]::new);
    }

    public static class TestCase extends AbstractTestCase {

        public Object[] inputTypes;
        public Object[] input;
        public int[] output;

        public Object[] getInputTypes() {
            return this.inputTypes;
        }

        @Override
        public Object[] getInput() {
            return this.input;
        }

        @Override
        public <T> boolean comp(T result) {
            return false;
        }
    }
}
