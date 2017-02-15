package xyz.isatimur.knowledgebase.design.patterns.singleton;

/**
 * Created by isati on 15.02.2017.
 * There are far more implementations and cases of different implementations for Singleton pattern.
 * The useful link can be found here <link>http://www.javaworld.com/article/2073352/core-java/simply-singleton.html</link>
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }


}

class Singleton2 {
    private static Singleton2 INSTANCE = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}

class SingletonSynchronized {
    private static volatile SingletonSynchronized INSTANCE = null;

    private SingletonSynchronized() {
    }

    public static SingletonSynchronized getInstance() {
        //Double-checked locking
        if (INSTANCE == null) {
            synchronized (SingletonSynchronized.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonSynchronized();
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;

    }
}

enum SingletonEnum {
    INSTANCE
}
