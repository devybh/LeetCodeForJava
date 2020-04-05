package edu.devybh.leetcode.solutions;

import edu.devybh.leetcode.Util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_0001_TwoSum extends AbstractSolution {

    public int[] twoSum(int[] nums, int target) {
        Util.log(Arrays.toString(nums));
        Util.log(Integer.toString(target));
        return new int[]{1, 2};
    }


    @Override
    public ArrayList<AbstractTestCase> getTestCases() {
        ArrayList<AbstractTestCase> testCases = new ArrayList<>();

        // 문제1
        TestCase testCase = new TestCase();
        testCase.inputs.add(new int[]{2, 7, 11, 15}); // param1
        testCase.inputs.add(9); // param2
        testCase.output.add(new int[]{0, 1});
        testCases.add(testCase);

        return testCases;
    }

    public static class TestCase extends AbstractTestCase {

        public ArrayList<Object> input;
        public ArrayList<Object> output;

        @Override
        public ArrayList<Object> getInput() {
            return this.input;
        }

        @Override
        public boolean comp(ArrayList<Object> result) {
            return false;
        }
    }
}
