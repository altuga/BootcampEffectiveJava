package com.ing.question09;

import java.util.Date;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 * Twitter : @altugaltintas
 */

public final class Period {
    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period
     * @param end   the end of the period; must not precede start
     * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException     if start or end is null
     */
    public Period(Date start, Date end) {
       
        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(
                    start + " after " + end);
        this.start = new Date(start.getTime());
        this.end =  new Date(end.getTime());



    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }
}
