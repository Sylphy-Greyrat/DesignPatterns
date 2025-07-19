package org.sylphy.singletonpattern;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.sylphy.singletonpattern.singleton.EnumSingleton;

/**
 * @className: SingletonPatternApplicationTests
 * @author: Sylphy
 * @date: 2025/1/4 21:04
 * @Version: 1.0
 * @description:
 */
@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SingletonPatternApplicationTests {
    @Test
    public void test() {
        EnumSingleton.INSTANCE.someMethod();
    }
}
