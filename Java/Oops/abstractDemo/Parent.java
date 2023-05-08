package Java.Oops.abstractDemo;

public abstract class Parent {

    int age;

    // Abstract Constructor not allowed
    // abstract Parent();

    public Parent(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("het");
    }

    void normal() {
        System.out.println("normal");
    }

    abstract void career();

    abstract void partener();
}
