package Java.Oops.properties.polymorphism;

public class Numbers {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(5, 5);
        obj.sum(5, 5, 5);
        // obj.sum(5,5,5,5);
    }
}
