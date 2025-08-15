package main.chapter10;

public class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
        System.out.println("Engine (" + type + ") created.");
    }

    public void start() {
        System.out.println(type + " engine started.");
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Engine (" + type + ") is being garbage collected.");
        super.finalize();
    }
}
