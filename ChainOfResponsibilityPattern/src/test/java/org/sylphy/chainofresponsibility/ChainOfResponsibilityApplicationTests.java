package org.sylphy.chainofresponsibility;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.sylphy.chainofresponsibility.factory.ProductChainFactory;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ChainOfResponsibilityApplicationTests {
    @Resource
    private ProductChainFactory<String, String> productChainFactory1;

    @Resource
    private ProductChainFactory<Object, String> productChainFactory2;

    @Test
    void test1() {
        System.out.println(productChainFactory1.execute("1"));
    }

    @Test
    void test2() {
        System.out.println(productChainFactory2.execute(new StringBuilder()));
    }

}
