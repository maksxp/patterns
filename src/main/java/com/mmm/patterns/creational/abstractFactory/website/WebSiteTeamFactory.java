package main.java.com.mmm.patterns.creational.abstractFactory.website;

import main.java.com.mmm.patterns.creational.abstractFactory.Developer;
import main.java.com.mmm.patterns.creational.abstractFactory.ProjectManager;
import main.java.com.mmm.patterns.creational.abstractFactory.ProjectTeamFactory;
import main.java.com.mmm.patterns.creational.abstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
