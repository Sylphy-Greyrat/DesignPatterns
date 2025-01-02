package org.sylphy.strategy.strategy;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @className: TwoStrategy
 * @author: Sylphy
 * @date: 2025/1/2 09:35
 * @Version: 1.0
 * @description:
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class TwoStrategy implements BaseStrategy {

    @Override
    public void handle(String string) {
        System.out.println("2");
    }
}
