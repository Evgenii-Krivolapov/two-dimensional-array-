package dimensionalArray;

import java.util.Arrays;

public class Main {

    private static int[][] array = {{5, 6, 3, 2}, {5, 1, 4, 9}};
    static DimensionalArray dimensionalArray = new DimensionalArray();
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.deepToString(dimensionalArray.twoDimensionalArray(array)));
    }



}
