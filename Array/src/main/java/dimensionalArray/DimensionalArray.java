package dimensionalArray;

public class DimensionalArray {

    public int[][] twoDimensionalArray(int[][] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length; l++) {
                        if(array[i][j] <= array[k][l]){
                            temp = array[i][j];
                            array[i][j] = array[k][l];
                            array[k][l] = temp;
                        }
                    }
                }
            }
        }
        return array;
    }
}
