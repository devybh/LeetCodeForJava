package edu.devybh.leetcode;

import edu.devybh.leetcode.solutions.AbstractSolution;
import edu.devybh.leetcode.solutions.Solution_0001_TwoSum;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class Main {

    static String solutionNumber = "0001";
    static String solutionName = "twoSum";

    public static void main(String[] args) {

        Util.log("Start Main");

        // make className
        String className;
        ArrayList<String> listForClassName = new ArrayList<String>();
        listForClassName.add("Solution");
        listForClassName.add(solutionNumber);
        listForClassName.add(solutionName.substring(0, 1).toUpperCase() + solutionName.substring(1));
        className = "edu.devybh.leetcode.solutions." + String.join("_", listForClassName);

        try {
            // getClass
            Class<?> solutionClass = Class.forName(className);
            // getInstance
            AbstractSolution solutionInstance = (AbstractSolution) solutionClass.getConstructor().newInstance();
            Util.log(className + " is created");
            // getMethod

            Method solutionMethod = null;
            for (Method eachMethod : solutionClass.getDeclaredMethods()) {
                if (!eachMethod.getName().equals(solutionName)) continue;
                solutionMethod = eachMethod;
                break;
            }

            ArrayList testCases = (ArrayList) solutionClass.getMethod("getTestCases").invoke(solutionInstance);

            // for (Object testCase: testCases)
            //
            // solutionMethod.invoke(solutionInstance, new int[]{2, 7, 11, 15}, 9);



            //Method method = solutionClass.getMethod(solutionName);
            //Util.log(solutionName + " is called");

            // get Inputs
            // ArrayList<AbstractSolution.AbstractTestCase> testCases = solutionInstance.getTestCases();

            // Util.log(testCases.toString());

            //method.getParameters();

            // call method for each testCase
            // for (AbstractSolution.AbstractTestCase testCase : testCases) {
            // noinspection JavaReflectionInvocation
            // method.invoke(solutionInstance, testCase.getInput());
            // }

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        Util.log("End Main");
    }
}
