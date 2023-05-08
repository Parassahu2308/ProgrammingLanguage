package Java.Oops.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("BBA");
    }

    @Override
    void partener() {
        System.out.printf("BBA");
    }
}
