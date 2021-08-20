package main.java.com.mmm.patterns.creational.abstractFactory.banking;

import main.java.com.mmm.patterns.creational.abstractFactory.Developer;
import main.java.com.mmm.patterns.creational.abstractFactory.ProjectManager;
import main.java.com.mmm.patterns.creational.abstractFactory.ProjectTeamFactory;
import main.java.com.mmm.patterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
