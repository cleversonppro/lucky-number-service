package com.luckynumber.generator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LuckyNumberGeneratorTest {

    @Test
    void shouldGenerateNumber() {
        assertThat(LuckyNumberGenerator.generate(6)).hasSize(6);
        assertThat(LuckyNumberGenerator.generate(2)).hasSize(2);
        assertThat(LuckyNumberGenerator.generate(60)).hasSize(60);
    }
}
