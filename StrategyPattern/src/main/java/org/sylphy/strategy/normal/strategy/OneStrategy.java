package org.sylphy.strategy.normal.strategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("normalOne")
@RequiredArgsConstructor
public class OneStrategy implements BaseStrategy {

    @Override
    public void handle(String string) {
        System.out.println(string);
        log.info("1");
    }
}