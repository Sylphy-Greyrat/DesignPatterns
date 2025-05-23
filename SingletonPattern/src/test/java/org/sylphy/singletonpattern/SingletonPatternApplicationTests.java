package org.sylphy.singletonpattern;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
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
@RunWith(SpringRunner.class)
public class SingletonPatternApplicationTests {
    @Test
    public void test() {
        EnumSingleton.INSTANCE.someMethod();
    }
}
