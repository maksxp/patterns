package main.java.com.mmm.patterns.creational.abstractFactory.website;

import main.java.com.mmm.patterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code ...");
    }
}
