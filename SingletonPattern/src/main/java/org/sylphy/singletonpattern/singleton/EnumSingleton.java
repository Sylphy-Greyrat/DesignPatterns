package org.sylphy.singletonpattern.singleton;


import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @className: EnumSingleton
 * @author: Sylphy
 * @date: 2025/1/4 21:01
 * @Version: 1.0
 * @description:
 */
@Slf4j
@NoArgsConstructor
public enum EnumSingleton {
    INSTANCE;

    public void someMethod() {
        log.info("EnumSingleton someMethod");
    }
}
