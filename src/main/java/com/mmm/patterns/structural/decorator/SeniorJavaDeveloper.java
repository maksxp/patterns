package main.java.com.mmm.patterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeCodeReview();
    }

    public String makeCodeReview() {
        return "make code review. ";
    }
}
