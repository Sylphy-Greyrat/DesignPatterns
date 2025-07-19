package org.sylphy.strategy.generics.strategy;


/**
 * @className: BaseStrategy
 * @author: Sylphy
 * @date: 2025/1/2 09:30
 * @Version: 1.0
 * @description:
 */
public interface BaseStrategy<T> {
    void handle(T t);
}
