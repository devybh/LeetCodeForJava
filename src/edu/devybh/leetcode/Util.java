package edu.devybh.leetcode;

public class Util {
    public static void log(String log) {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        String caller = stackTraceElements[1].getClassName();
        caller = caller.substring(caller.lastIndexOf(".")+1);
        System.out.println("[" + caller.substring(caller.lastIndexOf(".")+1) + "] " + log);
    }
}
