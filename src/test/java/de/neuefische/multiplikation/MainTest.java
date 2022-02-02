package de.neuefische.multiplikation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldMultiTwoNumbers() {
        // given
        var expectedResult = 8;

        // when
        var result = Main.multiplikation(2,4);

        // then
        Assertions.assertEquals(expectedResult, result);
    }
}