package main.java.com.mmm.patterns.creational.abstractFactory.banking;

import main.java.com.mmm.patterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
