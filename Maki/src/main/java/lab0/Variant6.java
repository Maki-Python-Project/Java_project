package lab0;

public class Variant6 {
    /**
     *
     * @param a is a two-digit number
     * @return decimal part of number
     */

    public int integerDecimalTask(int a) {
        assert a > 9 && a < 100: "Parameters should be positive";
        return a / 10;
    }

    /**
     *
     * @param a is a two-digit number
     * @return unit part of number
     */

    public int integerUnitsTask(int a) {
        assert a > 9 && a < 100: "Parameters should be positive";
        return a % 10;
    }

    /**
     *
     * @param A, B, C
     * @return true if A < B < C
     */
    public boolean booleanTask(int A, int B, int C) {
        return A < B && B < C;
    }


    /**
     *
     * @param a, b
     * @return maximum
     */
    public int ifTask(int a, int b) {
        return a > b ? a : b;
    }


    /**
     *
     * @param ordinalNumber is an ordinal number of month
     * @return amount of days this month has
     */
    public float switchTask(int ordinalNumber, float length) {
        assert ordinalNumber > 0 && ordinalNumber < 6: "Argument should be in range";
        assert length >= 0: "Argument should be positive";
        return UnitsOfLength.byOrdinal2ndWay(ordinalNumber).intGetLength() * length;
    }


    /**
     *
     * @param price is a float number
     * @return array of prices
     */
    public float[] forTask(float price) {
        assert price > 0: "Argument should be positive";

        float newPrice = price;
        float[] result = new float[5];

        for (int i = 0; i < 5; i++) {
            newPrice += price * 0.2;
            result[i] = newPrice;
        }
        return result;
    }

    /**
     *
     * @param a is an integer number
     * @return a!!
     */
    public float whileTask(int a) {
        assert a > 0: "Argument should be positive";

        float result = a;
        while (a > 2) result *= a -= 2;
        return result;
    }

    /**
     *
     * @param array is a set of numbers
     * @return first min and last max
     */
    public int[] minMaxTask(int[] array) {
        int min = array[0];
        int max = array[array.length - 1];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) break;
            min = array[i + 1];
        }

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] < array[i]) break;
            max = array[i - 1];
        }

        int[] result = {min, max};
        return result;
    }

    /**
     *
     * @param A is a first value of array
     * @param D is a second value of array
     * @param N is a size of array which will return
     * @return array of result
     */
    public int[] arrayTask(int A, int D, int N) {
        assert N > 0: "Argument should be positive";

        int[] result = new int[N];
        result[0] = A;
        result[1] = D;
        result[2] = A + D;

        for (int i = 3; i < N; i++) {
            result[i] = result[i - 1] * 2;
        }

        return result;
    }

    /**
     *
     * @param array is an input array of integer
     * @param M is a width of output twoDimensionArray
     * @param N is a length of output twoDimensionArray
     * @param Q is a multiplier
     * @return twoDimensionArray with input array multiplied by Q in each line
     */
    public int[][]  twoDimensionArrayTask(int[] array, int M, int N, int Q) {
        assert M > 0 && N > 0: "Argument should be positive";

        int[][] result = new int[N][M];

        for (int k = 0; k < M; k++) {
            result[0][k] = array[k];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = result[i - 1][j] * Q;
            }
        }

        return result;
    }

    public static void main(String... strings) {
    }
}
