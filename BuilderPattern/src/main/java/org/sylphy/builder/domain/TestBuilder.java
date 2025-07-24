package org.sylphy.builder.domain;

import lombok.Data;

@Data
public class TestBuilder {
    private String name;
    private int age;

    static public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final TestBuilder testBuilder;

        public Builder() {
            testBuilder = new TestBuilder();
        }

        public Builder name(String name) {
            testBuilder.name = name;
            return this;
        }

        public Builder age(int age) {
            testBuilder.age = age;
            return this;
        }

        public TestBuilder build() {
            return this.testBuilder;
        }
    }
}
