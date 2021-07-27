package exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {
    @org.junit.jupiter.api.Test
    void findEvenNumbInInterval() {
        var arr1 = new Integer[]{2,4,6,8,10};
        assertEquals(Arrays.asList(arr1), Exercise.findEvenNumbInInterval(0,10));

        var arr2 = new Integer[]{22,24,26,28,30};
        assertEquals(Arrays.asList(arr2), Exercise.findEvenNumbInInterval(22,30));

        assertEquals(new ArrayList<>(), Exercise.findEvenNumbInInterval(0, 1));


        assertThrows(IllegalArgumentException.class, () -> Exercise.findEvenNumbInInterval(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> Exercise.findEvenNumbInInterval(-9785, 154456461));
        assertThrows(IllegalArgumentException.class, () -> Exercise.findEvenNumbInInterval(89, 78));
    }

    @Test
    void toBinary() {
        assertEquals("10010100",Exercise.toBinary(148));
        assertEquals("0",Exercise.toBinary(0));
        assertEquals("11011001111111011000100110011",Exercise.toBinary(457158963));
        assertEquals("1101",Exercise.toBinary(13));
        assertThrows(IllegalArgumentException.class,() -> Exercise.toBinary(-1));
        assertThrows(IllegalArgumentException.class,() -> Exercise.toBinary(-98743845));
    }

    @Test
    void toCustomBase() {
        assertNull(Exercise.toCustomBase(-1,5));
        assertNull(Exercise.toCustomBase(478,1));
        assertNull(Exercise.toCustomBase(23,11));
        assertNull(Exercise.toCustomBase(789534,-90));

        assertEquals("111",Exercise.toCustomBase(7,2));
        assertEquals("2010",Exercise.toCustomBase(57,3));
        assertEquals("2202",Exercise.toCustomBase(162,4));
        assertEquals("3101103022104",Exercise.toCustomBase(783642154,5));
        assertEquals("24341",Exercise.toCustomBase(3589,6));
        assertEquals("6433424",Exercise.toCustomBase(781568,7));
        assertEquals("560",Exercise.toCustomBase(368,8));
        assertEquals("16",Exercise.toCustomBase(15,9));
        assertEquals("9638",Exercise.toCustomBase(9638,10));
    }

    @Test
    void calcDigitSum() {
        assertEquals(-1,Exercise.calcDigitSum(-1));
        assertEquals(-1,Exercise.calcDigitSum(-4546837));
        assertEquals(0,Exercise.calcDigitSum(0));
        assertEquals(15,Exercise.calcDigitSum(12354));
        assertEquals(6,Exercise.calcDigitSum(15));
        assertEquals(3,Exercise.calcDigitSum(3));
        assertEquals(55,Exercise.calcDigitSum(698754853));
        assertEquals(75,Exercise.calcDigitSum(999998769));
    }

    @Test
    void calcDigitCount() {
        assertEquals(0,Exercise.calcDigitCount(-1));
        assertEquals(0,Exercise.calcDigitCount(-876423));
        assertEquals(1,Exercise.calcDigitCount(0));
        assertEquals(2,Exercise.calcDigitCount(29));
        assertEquals(5,Exercise.calcDigitCount(96725));
        assertEquals(10,Exercise.calcDigitCount(1358364873));
    }

    @Test
    void reverse() {
        assertNull(Exercise.reverse(-1));
        assertNull(Exercise.reverse(-12375));

        assertEquals("0",Exercise.reverse(0));
        assertEquals("8763",Exercise.reverse(3678));
        assertEquals("987654321",Exercise.reverse(123456789));
        assertEquals("12321",Exercise.reverse(12321));
        assertEquals("44",Exercise.reverse(44));
    }

    @Test
    void mod() {
        assertEquals(-1,Exercise.mod(-1,2));
        assertEquals(-1,Exercise.mod(689,0));

        assertEquals(1,Exercise.mod(7,2));
        assertEquals(29,Exercise.mod(9687364,35));
        assertEquals(0,Exercise.mod(365,365));
        assertEquals(3188,Exercise.mod(453218763,7835));
        assertEquals(12,Exercise.mod(12,95));
        assertEquals(0,Exercise.mod(16,4));
    }

    @Test
    void div() {
        assertEquals(-1,Exercise.div(12378,0));
        assertEquals(-1,Exercise.div(-1,54));

        assertEquals(870,Exercise.div(7836,9));
        assertEquals(0,Exercise.div(7,8));
        assertEquals(1,Exercise.div(29,29));
        assertEquals(55,Exercise.div(23657891,425986));
        assertEquals(0,Exercise.div(0,743689423));
    }

    @Test
    void findDigitInNumberCount() {
        assertEquals(-1,Exercise.findDigitInNumberCount(-1,12357324));
        assertEquals(-1,Exercise.findDigitInNumberCount(36578945,-1));
        assertEquals(2,Exercise.findDigitInNumberCount(1786315476,7));
        assertEquals(9,Exercise.findDigitInNumberCount(333333333,3));
    }

    @Test
    void checkBirthNumbFormat() {
        assertFalse(Exercise.checkBirthNumbFormat("a155 /8962d"));
        assertFalse(Exercise.checkBirthNumbFormat("/7865369852"));
        assertFalse(Exercise.checkBirthNumbFormat("786341963*"));
        assertFalse(Exercise.checkBirthNumbFormat("752"));
        assertFalse(Exercise.checkBirthNumbFormat(""));
        assertFalse(Exercise.checkBirthNumbFormat("778601/142"));
        assertFalse(Exercise.checkBirthNumbFormat("770671/1429"));
        assertFalse(Exercise.checkBirthNumbFormat(null));

        //before 1 January 1954
        assertTrue(Exercise.checkBirthNumbFormat("746902/748 "));
        assertTrue(Exercise.checkBirthNumbFormat(" 365412369  "));

        //after 1 January 1954
        assertTrue(Exercise.checkBirthNumbFormat("121436/7890  "));
        assertTrue(Exercise.checkBirthNumbFormat(" 5608237453"));
        assertTrue(Exercise.checkBirthNumbFormat("960508/7856   "));
        assertTrue(Exercise.checkBirthNumbFormat("  8662157453"));
    }
}