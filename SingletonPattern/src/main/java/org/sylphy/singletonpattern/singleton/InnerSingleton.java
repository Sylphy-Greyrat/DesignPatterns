package org.sylphy.singletonpattern.singleton;


import lombok.extern.slf4j.Slf4j;

/**
 * @className: InnerSingleton
 * @author: Sylphy
 * @date: 2025/1/4 20:30
 * @Version: 1.0
 * @description:
 */
@Slf4j
public class InnerSingleton {
    private InnerSingleton() {
        log.info("InnerSingleton is created");
    }

    public static InnerSingleton getInstance() {
        return Singleton.INSTANCE;
    }

    public void someMethod() {
        log.info("InnerSingleton someMethod");
    }

    private static class Singleton {
        static final InnerSingleton INSTANCE = new InnerSingleton();
    }
}
