package org.sylphy.strategy.generics.strategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("genericsOne")
@RequiredArgsConstructor
public class OneStrategy implements BaseStrategy<String> {

    @Override
    public void handle(String string) {
        System.out.println(string);
        log.info("1");
    }
}