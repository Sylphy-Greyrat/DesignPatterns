package org.sylphy.chainofresponsibility.factory;


import org.springframework.util.Assert;
import org.sylphy.chainofresponsibility.chain.IHandler;

import java.util.List;

/**
 * @className: ProductChainFactory
 * @author: Sylphy
 * @date: 2025/1/1 22:40
 * @Version: 1.0
 * @description:
 */
public class ProductChainFactory<T, R> {
    private final IHandler<T, R> firstHandler;

    public ProductChainFactory(List<IHandler<T, R>> handlers) {
        Assert.notEmpty(handlers, "无责任实现Bean");
        for (int i = 0; i < handlers.size() - 1; i++) {
            handlers.get(i).setNextHandler(handlers.get(i + 1));
        }
        firstHandler = handlers.get(0);
    }

    public R execute(T t) {
        return firstHandler.handle(t);
    }
}
