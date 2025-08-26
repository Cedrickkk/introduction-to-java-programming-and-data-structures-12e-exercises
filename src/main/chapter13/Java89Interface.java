package main.chapter13;

public interface Java89Interface {
    default void doSomething() {

    }

    static int getAValue() {
        return 0;
    }

    private static int getAStaticValue() {
        return 0;
    }

    private void performPrivateAction() {
        
    }
}
