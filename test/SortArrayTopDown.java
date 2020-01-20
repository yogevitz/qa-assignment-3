import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class SortArrayTopDown {

    @Test
    public void sortArrayNULL() {
        try {
            int[] sorted = ProgramStubForSortArray.sortArray(null);
            assertEquals(null, sorted);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void sortArrayEmpty() {
        try {
            int[] arr = new int[0];
            int[] sorted = ProgramStubForSortArray.sortArray(arr);
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
            int[] sortedAns = ProgramStubForSortArray.sortArray(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(sortedAns[i], sortedArr[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void sortArrayRepeatedNum() {
        try {
            int[] arr = {5,2,8,5,5,1};
            int[] sortedArr = {1,2,5,5,5,8};
            int[] sortedAns = ProgramStubForSortArray.sortArray(arr);
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
            int[] sortedAns = ProgramStubForSortArray.sortArray(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(sortedAns[i], sortedArr[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}

class ProgramStubForSortArray extends Program {

    public static int[] sortArray(int[] arr) {
        if (arr == null) return null;
        int[] res = copyArr(arr);
        for(int i=0; i<size(arr); i++)
            for (int j=0; j<size(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }

    public static int size(int[] arr) {
        return arr == null ? -1 : arr.length;
    }

    public static int[] copyArr(int[] arr) {
        if (arr == null) return null;
        int[] res = new int[size(arr)];
        for (int i = 0; i < size(arr); i++) {
            res[i] = arr[i];
        }
        return res;
    }
}