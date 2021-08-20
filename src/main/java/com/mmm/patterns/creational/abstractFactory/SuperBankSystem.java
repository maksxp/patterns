package main.java.com.mmm.patterns.creational.abstractFactory;

import main.java.com.mmm.patterns.creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
