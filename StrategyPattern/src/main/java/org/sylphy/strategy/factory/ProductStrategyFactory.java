package org.sylphy.strategy.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sylphy.strategy.strategy.BaseStrategy;

import java.util.Map;

@Component
public class ProductStrategyFactory {
    private final Map<String, BaseStrategy> handlerMap;

    @Autowired
    public ProductStrategyFactory(Map<String, BaseStrategy> map) {
        this.handlerMap = map;
    }

    public BaseStrategy getHandler(String string) {
        return handlerMap.get(string);
    }

}
