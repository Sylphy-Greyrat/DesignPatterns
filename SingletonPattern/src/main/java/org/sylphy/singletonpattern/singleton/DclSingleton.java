package org.sylphy.singletonpattern.singleton;


import lombok.extern.slf4j.Slf4j;

/**
 * @className: DclSingleton
 * @author: Sylphy
 * @date: 2025/1/4 20:27
 * @Version: 1.0
 * @description:
 */
@Slf4j
public class DclSingleton {
    private static volatile DclSingleton instance;
    private DclSingleton() {
        System.out.println("DclSingleton is created");
    }
    public static DclSingleton getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (DclSingleton.class) {
            if (instance == null) {
                instance = new DclSingleton();
            }
        }
        return instance;
    }
    public void someMethod() {
        System.out.println("DclSingleton someMethod");
    }
}
