package main.java.com.mmm.patterns.creational.abstractFactory.banking;

import main.java.com.mmm.patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code ....");
    }
}
