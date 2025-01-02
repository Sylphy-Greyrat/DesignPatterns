package org.sylphy.chainofresponsibility.chain.object;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.sylphy.chainofresponsibility.chain.IHandler;

/**
 * @className: ProductOneHandler
 * @author: Sylphy
 * @date: 2025/1/2 00:53
 * @Version: 1.0
 * @description:
 */
@Service
@Order(1)
public class ProductAHandler extends IHandler<Object, String> {
    @Override
    public String handle(Object string) {
        System.out.println("a");
        return super.handle(string);
    }
}
