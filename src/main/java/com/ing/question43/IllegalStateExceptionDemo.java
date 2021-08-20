package com.ing.question43;


public class IllegalStateExceptionDemo {

    private boolean initted;

    public void initialise() {
        // ...
        initted = true;
    }

    /**
     * @throws IllegalStateException if initted is not initialise
     */
    public void doSomething() {
        if (!initted)
            throw new IllegalStateException("Object not initialised");
    }


}
