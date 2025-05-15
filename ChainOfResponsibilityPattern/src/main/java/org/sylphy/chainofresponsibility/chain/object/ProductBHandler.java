package org.sylphy.chainofresponsibility.chain.object;


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
public class ProductBHandler extends IHandler<Object, String> {
    @Override
    public String handle(Object object) {
        if (object instanceof StringBuilder stringBuilder) {
            stringBuilder.append("B");
        }
        return object.toString();
    }
}
