package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Variant6Test {

    ////////////////////////////////////////////////

    @Test(dataProvider = "integerDecimalProvider")
    public void integerDecimalTest(int p1, int[] p4) {
        assertEquals(new Variant6().integerDecimalTask(p1), p4);
    }

    @DataProvider
    public Object[][] integerDecimalProvider() {
        return new Object[][] { {23, 2, 3}, {45, 4, 5}, {83, 8, 3} };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeIntegerDecimalTest() {
        new Variant6().integerDecimalTask(100);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeIntegerUnitsTest() {
        new Variant6().integerDecimalTask(9);
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int p4) {
        assertEquals(new Variant6().ifTask(p1, p2), p4);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { {2, 3, 3}, {3, 7, 7}, {19, -3, 19} , {19, 19, 19}};
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, int p3, boolean p4) {
        assertEquals(new Variant6().booleanTask(p1, p2, p3), p4);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { { 1, 2, 3, true }, { 3, 2, 1, false }, { 4, 5, 1, false } };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(int p1, float p2, float p4) {
        assertEquals(new Variant6().switchTask(p1, p2), p4);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] {{ 2, 7.328f, 7328}, {2, 7.328f, 7328}, {2, 7.328f, 7328}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void switchLessTest() {
        new Variant6().switchTask(0, 1);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void switchOverTest() {
        new Variant6().switchTask(6, 1);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void switchNegativeTest() {
        new Variant6().switchTask(3, -0.01f);
    }
    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")

    public void forTest(float price, float[] p4) {
        assertEquals(new Variant6().forTask(price), p4);
    }

    @DataProvider
    public Object[][] forProvider() {
        float[] p41 = {14.639999f, 17.08f, 19.52f, 21.960001f, 24.400002f};
        return new Object[][] { {12.2f, p41}, {12.2f, p41}, {12.2f, p41} };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeForTest() {
        new Variant6().forTask(-2.21f);
    }

    //////////////////////////////////////////

    @Test(dataProvider = "whileProvider")
    public void whileTest(int p1, float p4) {
        assertEquals(new Variant6().whileTask(p1), p4);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { {3, 3}, {4, 8}, {5, 15}, {6, 48}, {7, 105}};
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeWhileProvider")
    public void negativeWhileTest(int a) {
        new Variant6().whileTask(a);
    }

    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][] {{-7}, {-2}, {0}};
    }

    //////////////////////////////////////////
    @Test(dataProvider = "minMaxProvider")
    public void minMaxTest(int[] array, int[] p4) {
        assertEquals(new Variant6().minMaxTask(array), p4);
    }

    @DataProvider
    public Object[][] minMaxProvider() {
        return new Object[][] { { new int[] {8, 6, 5, 7, 10, 8, 6}, 5, 10}, { new int[] {43, 36, 33, 25, 28, 20, 18, 15}, 15, 43},
                { new int[] {132, 127, 86, 76, 34, 21, 14, 6}, 6, 132}, {new int[] {4, 7, 3, 1, 6, 1, 7, 4, 5}, 1, 7} };
    }

    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int A, int D, int N, int[] p4) {
        assertEquals(new Variant6().arrayTask(A, D, N), p4);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        int[] p4 = {2, 3, 5, 10, 20};
        int[] p5 = {3, 7, 10, 20, 40, 80, 160};
        int[] p6 = {1, 3, 4, 8, 16, 32, 64};
        int[] p7 = {3, -9, -6, -12, -24, -48, -96, -192};

        return new Object[][] {{2, 3, 5, p4}, {3, 7, 7, p5}, {1, 3, 7, p6}, {3, -9, 8, p7}};
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeSizeOfArrowWhileProvider")
    public void negativeSizeOfArrowWhileProvider(int A, int D, int N) {
        new Variant6().arrayTask(A, D, N);
    }

    @DataProvider
    public Object[][] negativeSizeOfArrowWhileProvider() {
        return new Object[][] {{2, 3, -3}, {3, 7, 0}, {5, 4, -7}};
    }

    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[] input, int M, int N, int Q, int[][] p4) {
        assertEquals(new Variant6().twoDimensionArrayTask(input, M, N, Q), p4);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[] input = {3, 5, 2, 13, 1};
        int[] input2 = {-2, 4, 5, -6, 3};

        int[][] p4 = {{3, 5, 2, 13, 1},
                {6, 10, 4, 26, 2},
                {12, 20, 8, 52, 4},
                {24, 40, 16, 104, 8},
                {48, 80, 32, 208, 16}};
        int[][] p5 = {{-2, 4, 5, -6, 3},
                {6, -12, -15, 18, -9},
                {-18, 36, 45, -54, 27},
                {54, -108, -135, 162, -81},
                {-162, 324, 405, -486, 243}};
        return new Object[][]{{input, 5, 5, 2, p4}, {input2, 5, 5, -3, p5}};
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeSizeOfTwoDimensionArrowWhileProvider")
    public void negativeSizeOfArrowWhileProvider2(int[] input, int M, int N, int Q) {
        new Variant6().twoDimensionArrayTask(input, M, N, Q);
    }

    @DataProvider
    public Object[][] negativeSizeOfTwoDimensionArrowWhileProvider() {
        return new Object[][] {{new int[]{}, 0, -3, 2}, {new int[]{}, -2, 0, 2}, {new int[]{}, -3, -7, 2}};

    }
}
