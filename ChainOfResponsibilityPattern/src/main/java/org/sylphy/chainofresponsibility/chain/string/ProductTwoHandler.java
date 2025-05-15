package org.sylphy.chainofresponsibility.chain.string;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.sylphy.chainofresponsibility.chain.IHandler;

/**
 * @className: ProductTwoHandler
 * @author: Sylphy
 * @date: 2025/1/2 00:54
 * @Version: 1.0
 * @description:
 */
@Service
@Order(2)
public class ProductTwoHandler extends IHandler<String, String> {
    @Override
    public String handle(String string) {
        System.out.println(string);
        return "<String, String>";
    }
}
