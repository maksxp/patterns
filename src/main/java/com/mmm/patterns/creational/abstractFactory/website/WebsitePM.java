package main.java.com.mmm.patterns.creational.abstractFactory.website;

import main.java.com.mmm.patterns.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
