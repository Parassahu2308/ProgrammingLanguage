package Java.Oops.abstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("Engineer");
    }

    @Override
    void partener() {
        System.out.printf("Engineer");
    }

}
