package org.sylphy.strategy;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sylphy.strategy.factory.ProductStrategyFactory;

/**
 * @className: StratrgyApplication
 * @author: Sylphy
 * @date: 2025/1/2 09:27
 * @Version: 1.0
 * @description:
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class StratrgyApplicationTests {
    @Autowired
    private ProductStrategyFactory productStrategyFactory;

    @Test
    void test1() {
        productStrategyFactory.getHandler("oneStrategy").handle("1");
    }

    @Test
    void test2() {
        productStrategyFactory.getHandler("twoStrategy").handle("1");
    }
}
