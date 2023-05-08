package Java.Oops.interfaces;

public class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("Brake normal");
    }

    @Override
    public void start() {
        System.out.println("start normal");
    }

    @Override
    public void stop() {
        System.out.println("stop normal");
    }

    @Override
    public void acc() {
        System.out.println("acc normal");
    }

}
