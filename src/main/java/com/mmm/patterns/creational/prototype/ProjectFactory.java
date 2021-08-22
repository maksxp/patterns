package main.java.com.mmm.patterns.creational.prototype;

public class ProjectFactory {

    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject (){
        return (Project) project.copy();
    }
}
