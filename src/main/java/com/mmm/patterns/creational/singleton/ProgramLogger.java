package main.java.com.mmm.patterns.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "this is log file.  \n\n";

    public static synchronized ProgramLogger getProgramLogger (){
        if (programLogger==null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger (){
    }

    public void addLogInfo (String logInfo) {
        logFile +=logInfo + "\n";
    }

    public void showLogInfo (){
        System.out.println(logFile);
    }
}
