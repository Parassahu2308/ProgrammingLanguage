package Java.Oops.staticExample;

public class Human {
    String name;
    int age;
    boolean married;
    // int population;
    static int population;

    static void message() {
        System.out.println("Hello world");
        // System.out.println(this.age); // cant use this over here because this
        // represent to object and
        // static represnent to class
    }

    public Human(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
        // this.population += 1;
        Human.population += 1; // this.population+=1
    }
}
