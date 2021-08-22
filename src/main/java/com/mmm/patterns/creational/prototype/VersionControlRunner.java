package main.java.com.mmm.patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {

        Project master = new Project(1, "Super project", "super source code");

        System.out.println(master);

        System.out.println("___________________________________________");

//        Project copy = (Project) master.copy();
        ProjectFactory factory = new ProjectFactory(master);
        Project copy = factory.cloneProject();

        System.out.println(copy);
    }
}
