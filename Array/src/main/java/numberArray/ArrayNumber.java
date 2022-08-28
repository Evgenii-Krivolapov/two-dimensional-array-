package numberArray;

public class ArrayNumber {

    public int maxNumber(int[][] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Empty array");
        }

        int resultMax = Integer.MIN_VALUE;
        for (int[] i : array) {
            for (int j : i) {
                resultMax = Math.max(resultMax, j);
            }
        }
        return resultMax;
    }

    public int minNumber(int[][] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Empty array");
        }

        int resultMin = Integer.MAX_VALUE;
        for (int[] i : array) {
            for (int j : i) {
                resultMin = Math.min(resultMin, j);
            }
        }
        return resultMin;
    }

    public int middleNumber(int[][] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Empty array");
        }
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                sum += array[i][j];
            }
        }
        return sum / array.length;
    }
}
