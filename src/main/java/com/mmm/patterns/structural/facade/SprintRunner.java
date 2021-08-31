package main.java.com.mmm.patterns.structural.facade;

public class SprintRunner {
    public static void main(String[] args) {
//        //without facade
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);
//
//        System.out.println("__________________________");
//        bugTracker.finishSprint();
//        developer.doJobBeforeDeadline(bugTracker);

        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblems();
    }
}
