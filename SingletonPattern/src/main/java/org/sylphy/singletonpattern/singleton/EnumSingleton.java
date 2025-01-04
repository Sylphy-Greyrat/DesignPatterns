package org.sylphy.singletonpattern.singleton;


import lombok.NoArgsConstructor;

/**
 * @className: EnumSingleton
 * @author: Sylphy
 * @date: 2025/1/4 21:01
 * @Version: 1.0
 * @description:
 */
@NoArgsConstructor
public enum EnumSingleton {
    INSTANCE;

    public void someMethod() {
        System.out.println("EnumSingleton someMethod");
    }
}
