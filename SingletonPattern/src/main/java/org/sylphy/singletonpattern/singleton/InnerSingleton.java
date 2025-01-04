package org.sylphy.singletonpattern.singleton;


/**
 * @className: InnerSingleton
 * @author: Sylphy
 * @date: 2025/1/4 20:30
 * @Version: 1.0
 * @description:
 */
public class InnerSingleton {
    private InnerSingleton() {
        System.out.println("InnerSingleton is created");
    }

    public static InnerSingleton getInstance() {
        return Singleton.INSTANCE;
    }

    public void someMethod() {
        System.out.println("InnerSingleton someMethod");
    }

    private static class Singleton {
        static final InnerSingleton INSTANCE = new InnerSingleton();
    }
}
