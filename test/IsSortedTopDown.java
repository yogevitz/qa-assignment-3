import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class IsSortedTopDown {

    @Test
    public void isSortedNULL() {
        try {
            int[] arr = null;
            assertTrue(ProgramStubForIsSorted.isSorted(arr));
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void isSortedEmpty() {
        try {
            int[] arr = {};
            assertTrue(ProgramStubForIsSorted.isSorted(arr));
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void isSorted() {
        try {
            int[] arr = {1,2,3};
            assertTrue(ProgramStubForIsSorted.isSorted(arr));
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void isSortedNotSorted() {
        try {
            int[] arr = {3,2,1};
            assertFalse(ProgramStubForIsSorted.isSorted(arr));
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}

class ProgramStubForIsSorted extends Program {

    public static boolean isSorted(int[] arr) {
        int[] sorted = sortArray(arr);
        return equalArrays(arr, sorted);
    }

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

    public static boolean equalArrays(int[] arr1, int[] arr2) {
        if (arr1==null && arr2 == null) return true;
        if (arr1==null || arr2 == null) return false;
        if (size(arr1)!=size(arr2)) return false;
        for (int i=0; i<size(arr1); i++)
            if (arr1[i]!=arr2[i]) return false;
        return true;
    }
}
