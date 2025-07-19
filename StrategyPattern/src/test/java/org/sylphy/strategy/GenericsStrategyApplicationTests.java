package org.sylphy.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.sylphy.strategy.generics.factory.ProductStrategyFactory;
import org.sylphy.strategy.generics.strategy.BaseStrategy;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class GenericsStrategyApplicationTests {
    @Autowired
    private ProductStrategyFactory productStrategyFactory;

    @Test
    public void test1() {
        BaseStrategy<String> oneStrategy = (BaseStrategy<String>) productStrategyFactory.getHandler("genericsOne");
        oneStrategy.handle("1");
    }

    @Test
    public void test2() {
        BaseStrategy<String> oneStrategy = (BaseStrategy<String>) productStrategyFactory.getHandler("genericsTwo");
        oneStrategy.handle("1");
    }
}
