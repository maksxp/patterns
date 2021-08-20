package main.java.com.mmm.patterns.creational.abstractFactory.website;

import main.java.com.mmm.patterns.creational.abstractFactory.Developer;
import main.java.com.mmm.patterns.creational.abstractFactory.ProjectManager;
import main.java.com.mmm.patterns.creational.abstractFactory.ProjectTeamFactory;
import main.java.com.mmm.patterns.creational.abstractFactory.Tester;
import main.java.com.mmm.patterns.creational.abstractFactory.banking.BankingTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("creating auction website");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
