package numberArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayNumberTest {
    private ArrayNumber arrayNumber = new ArrayNumber();
    private int[][] array = {{45,32,83,34},{12,56,74,90}};

    @Test
    void maxNumber() throws Exception {
        int actual = arrayNumber.maxNumber(array);
        int expected = 90;
        assertEquals(expected,actual);
    }

    @Test
    void minNumber() throws Exception {
        int actual = arrayNumber.minNumber(array);
        int expected = 12;
        assertEquals(expected,actual);
    }

    @Test
    void middleNumber() throws Exception {
        int actual = arrayNumber.middleNumber(array);
        int expected = 80;
        assertEquals(expected,actual);
    }
}