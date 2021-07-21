package exercises;

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
}