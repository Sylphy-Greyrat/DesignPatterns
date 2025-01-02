package org.sylphy.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sylphy.chainofresponsibility.factory.ProductChainFactory;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class ChainOfResponsibilityApplicationTests {
    @Autowired
    private ProductChainFactory productChainFactory1;

    @Autowired
    private ProductChainFactory productChainFactory2;

    @Test
    void test1() {
        System.out.println(productChainFactory1.execute("1"));
    }

    @Test
    void test2() {
        System.out.println(productChainFactory2.execute("1"));
    }

}
