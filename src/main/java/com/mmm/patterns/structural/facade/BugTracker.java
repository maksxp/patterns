package main.java.com.mmm.patterns.structural.facade;

public class BugTracker {
    public boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint (){
        System.out.println("Spring is active");
        activeSprint = true;
    }

    public void finishSprint (){
        System.out.println("Spring is NOT active");
        activeSprint = false;
    }
}
