package main.java.com.mmm.patterns.creational.factory;

public class Program {

    static DeveloperFactory createDeveloperBySpeciality (String speciality) {
        if (speciality.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality+" is unknown speciality");
        }
    }

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("JaVa");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
}
