package com.luckynumber.generator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import lombok.SneakyThrows;

public class LuckyNumberGenerator {

    private static final int MAX_VALUE = 60;

    @SneakyThrows
    public static Set<Integer> generate(final Integer size) {

        if (size > MAX_VALUE)
            throw new Exception("The size cannot be greater than the max value, that is " + MAX_VALUE);

        final Random random = new Random();
        final Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < size) {
            numbers.add(random.nextInt(MAX_VALUE) + 1);
        }

        return numbers;
    }
}
