package mxutils;

import java.util.Date;

/**
 * @author Ck
 */
public class TimeSpan {
    private long now;

    public TimeSpan() {
        init();
    }

    public void init() {
        now = System.currentTimeMillis();
        System.out.println(now);
    }

    public void printTimeSpan() {
        System.out.println("Time Span: " + (System.currentTimeMillis() - now) + "ms");
    }

    public void printTimeSpanAndInit(){
        System.out.println("Time Span: " + (System.currentTimeMillis() - now) + "ms");
        init();
    }
}
