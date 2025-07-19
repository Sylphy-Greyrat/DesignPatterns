package org.sylphy.strategy.normal.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sylphy.strategy.normal.strategy.BaseStrategy;

import java.util.Map;

@Component("normal")
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
