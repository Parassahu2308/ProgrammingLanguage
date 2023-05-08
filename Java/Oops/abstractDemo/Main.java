package Java.Oops.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();

        // Daughter daughter = new Daughter(20);
        Parent daughter = new Daughter(20);
        daughter.career();

        // You cannot create obj of abstract class
        // Parent mom = new Parent();

        Parent.hello();

    }
}
