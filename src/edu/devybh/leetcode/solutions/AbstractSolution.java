package edu.devybh.leetcode.solutions;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Solution 은 TestCase
 */
abstract public class AbstractSolution {

    // public abstract <Any> Any solution();

    public abstract ArrayList<AbstractTestCase> getTestCases();

    public abstract static class AbstractTestCase {

        public ArrayList<Object> inputs;
        public ArrayList<Object> output;

        public AbstractTestCase() {
        }

        /**
         * Solution Method 에 입력될 Input 을 정의합니다.
         */
        public abstract ArrayList<Object> getInput();

        /**
         * 실행결과를 인자로 넣어 예상 Output 과 비교합니다.
         */
        public abstract boolean comp(ArrayList<Object> result);
    }
}
