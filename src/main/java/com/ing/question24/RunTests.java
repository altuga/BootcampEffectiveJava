package com.ing.question24;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/*
TODO

1 - Run RunTests.java
2 - Expected to see 3 methods should pass
3 - Any abnormality  ?

 */
public class RunTests {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Sample.class ;

        for (Method m : testClass.getDeclaredMethods()) {
            if (m.getName().startsWith("test")) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (Exception exc) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }
}
