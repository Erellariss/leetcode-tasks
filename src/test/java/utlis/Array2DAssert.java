package utlis;

import static org.junit.jupiter.api.Assertions.*;

public class Array2DAssert {

    public static void assert2DArrayEquals(int[][] expected, int[][] actual) {
        assertNotNull(expected, "Expected array must not be null");
        assertNotNull(actual, "Actual array must not be null");
        assertEquals(expected.length, actual.length,
                "Row count mismatch: expected " + expected.length + ", but got " + actual.length);

        for (int i = 0; i < expected.length; i++) {
            final int rowIndex = i;
            int[] expectedRow = expected[rowIndex];
            int[] actualRow = actual[rowIndex];

            assertNotNull(expectedRow, "Expected row at index " + rowIndex + " is null");
            assertNotNull(actualRow, "Actual row at index " + rowIndex + " is null");

            assertEquals(expectedRow.length, actualRow.length,
                    "Column count mismatch at row " + rowIndex + ": expected " + expectedRow.length + ", but got " + actualRow.length);

            for (int j = 0; j < expectedRow.length; j++) {
                final int colIndex = j;
                assertEquals(expectedRow[colIndex], actualRow[colIndex],
                        "Value mismatch at [" + rowIndex + "][" + colIndex + "]: expected " +
                                expectedRow[colIndex] + ", but got " + actualRow[colIndex]);
            }
        }
    }
}
