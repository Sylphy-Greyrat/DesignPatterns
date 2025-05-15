package org.sylphy.chainofresponsibility.chain.string;


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
public class ProductOneHandler extends IHandler<String, String> {
    @Override
    public String handle(String string) {
        System.out.println(string);
        string = string + "a";
        return super.handle(string);
    }
}
