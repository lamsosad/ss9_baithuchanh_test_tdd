package bai1_ungdungmaytinh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Testing add 0 + 0")
    void add() {
        int first = 0;
        int second = 0;
        int expected = 0;
        int result = Calculator.add(first, second);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 4 - 2")
    void sub() {
        int first = 4;
        int second = 2;
        int expected = 2;
        int result = Calculator.sub(first, second);
        Assertions.assertEquals(expected, result);
    }
}