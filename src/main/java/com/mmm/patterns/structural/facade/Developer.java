package main.java.com.mmm.patterns.structural.facade;

public class Developer {
    public void doJobBeforeDeadline (BugTracker bugTracker){
        if (bugTracker.activeSprint){
            System.out.println("Developer is solving problems");
        } else {
            System.out.println("developer has a rest");
        }
    }
}
