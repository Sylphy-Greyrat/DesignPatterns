package org.sylphy.builder;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.sylphy.builder.domain.TestBuilder;

/**
 * @className: BuilderApplicationTest
 * @author: Sylphy
 * @date: 2025/7/24 09:27
 * @Version: 1.0
 * @description:
 */
@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BuilderApplicationTest {
    @Resource
    private ObjectMapper objectMapper;

    @Test
    public void test() throws JsonProcessingException {
        TestBuilder testBuilder = TestBuilder.builder()
                .name("Sylphy")
                .age(18)
                .build();
        log.info("{}", objectMapper.writeValueAsString(testBuilder));
    }
}
