package org.sylphy.strategy;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.sylphy.strategy.normal.factory.ProductStrategyFactory;

/**
 * @className: StratrgyApplication
 * @author: Sylphy
 * @date: 2025/1/2 09:27
 * @Version: 1.0
 * @description:
 */
@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class NormalStrategyApplicationTests {
    @Autowired
    private ProductStrategyFactory productStrategyFactory;

    @Test
    public void test1() {
        productStrategyFactory.getHandler("normalOne").handle("1");
    }

    @Test
    public void test2() {
        productStrategyFactory.getHandler("normalTwo").handle("1");
    }
}
