package pl.bekz.singleton.multithread.doubleBlock;

public class Singleton {

    private volatile static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (getInstance() == null) {
            synchronized (Singleton.class) {
                if (getInstance() == null) {
                    singleton = new Singleton();
                }
            }
        }
        return getInstance();
    }

    static void demoMethod() {
        System.out.println("demo for singleton");
    }
}
