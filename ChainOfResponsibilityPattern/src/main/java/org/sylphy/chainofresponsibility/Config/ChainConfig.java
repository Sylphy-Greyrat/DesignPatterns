package org.sylphy.chainofresponsibility.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sylphy.chainofresponsibility.chain.IHandler;
import org.sylphy.chainofresponsibility.factory.ProductChainFactory;

import java.util.List;

/**
 * @className: ChainConfig
 * @author: Sylphy
 * @date: 2025/1/2 01:01
 * @Version: 1.0
 * @description:
 */
@Configuration
public class ChainConfig {
    @Bean
    public ProductChainFactory<String, String> productChainFactory1(List<IHandler<String, String>> handlers) {
        return new ProductChainFactory<>(handlers);
    }

    @Bean
    public ProductChainFactory<Object, String> productChainFactory2(List<IHandler<Object, String>> handlers) {
        return new ProductChainFactory<>(handlers);
    }
}
