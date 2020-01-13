import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class SortArrayBottomUp {

    @Test
    public void sortArrayNULL() {
        try {
            int[] sorted = Program.sortArray(null);
            assertEquals(null, sorted);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void sortArrayEmpty() {
        try {
            int[] arr = new int[0];
            int[] sorted = Program.sortArray(arr);
            assertTrue(sorted != null);
            assertTrue(sorted.length == 0);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void sortArray() {
        try {
            int[] arr = {3,2,8,5,6,1};
            int[] sortedArr = {1,2,3,5,6,8};
            int[] sortedAns = Program.sortArray(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(sortedAns[i], sortedArr[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void sortArrayRecurringNum() {
        try {
            int[] arr = {5,2,8,5,5,1};
            int[] sortedArr = {1,2,5,5,5,8};
            int[] sortedAns = Program.sortArray(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(sortedAns[i], sortedArr[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void sortArrayWithMinus() {
        try {
            int[] arr = {3,-2,-8,5,6,1};
            int[] sortedArr = {-8,-2,1,3,5,6};
            int[] sortedAns = Program.sortArray(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(sortedAns[i], sortedArr[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}
