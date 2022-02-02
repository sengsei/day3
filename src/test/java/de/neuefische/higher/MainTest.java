package de.neuefische.higher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void isHigher100(){
    // given
    var number = 101;
    // when
    boolean result = Main.isHigher(number);

    // then
        Assertions.assertTrue(result);
    }

}