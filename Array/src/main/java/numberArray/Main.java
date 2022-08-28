package numberArray;

public class Main {
    static ArrayNumber arrayNumber = new ArrayNumber();
    private static int[][] array = {{5, 6, 3, 2}, {5, 1, 4, 9}};

    public static void main(String[] args) throws Exception {
        System.out.println(arrayNumber.maxNumber(array));
        System.out.println(arrayNumber.minNumber(array));
        System.out.println(arrayNumber.middleNumber(array));
    }
}
