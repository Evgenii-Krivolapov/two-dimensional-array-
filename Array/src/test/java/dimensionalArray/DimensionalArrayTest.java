package dimensionalArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DimensionalArrayTest {
    DimensionalArray dimensionalArray = new DimensionalArray();
    @Test
    void twoDimensionalArray() {
        int[][] array = {{1,6,3,7},{4,8,3,9}};

        int[][] actual = dimensionalArray.twoDimensionalArray(array);
        int[][] expected = {{1,3,3,4},{6,7,8,9}};
        assertArrayEquals(expected,actual);
    }
}