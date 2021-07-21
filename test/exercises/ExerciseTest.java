package exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @org.junit.jupiter.api.Test
    void findEvenNumbInInterval() {
        assertNull(Exercise.findEvenNumbInInterval(-1, 0));
        assertNull(Exercise.findEvenNumbInInterval(-9785, 154456461));
        assertNull(Exercise.findEvenNumbInInterval(89, 78));
        assertEquals(new ArrayList<>(), Exercise.findEvenNumbInInterval(0, 1));

        var arr1 = new Integer[]{2,4,6,8,10};
        assertEquals(Arrays.asList(arr1), Exercise.findEvenNumbInInterval(0,10));

        var arr2 = new Integer[]{22,24,26,28,30};
        assertEquals(Arrays.asList(arr2), Exercise.findEvenNumbInInterval(22,30));
    }

    @Test
    void toBinary() {
        assertEquals("10010100",Exercise.toBinary(148));
        assertEquals("0",Exercise.toBinary(0));
        assertEquals("11011001111111011000100110011",Exercise.toBinary(457158963));
        assertEquals("1101",Exercise.toBinary(13));
        assertNull(Exercise.toBinary(-1));
        assertNull(Exercise.toBinary(-98743845));
    }

    @Test
    void toCustomBase() {
    }

    @Test
    void calcDigitSum() {
    }

    @Test
    void calcDigitCount() {
    }

    @Test
    void reverse() {
    }

    @Test
    void mod() {
    }

    @Test
    void div() {
    }

    @Test
    void findDigitInNumberCount() {
    }

    @Test
    void checkBirthNumbFormat() {
    }
}