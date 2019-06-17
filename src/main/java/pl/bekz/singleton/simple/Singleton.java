package pl.bekz.singleton.simple;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (getInstance() == null){
            singleton = new Singleton();
        }
        return getInstance();
    }

    static void demoMethod(){
        System.out.println("demo for singleton");
    }
}
