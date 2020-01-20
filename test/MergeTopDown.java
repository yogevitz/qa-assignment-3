import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MergeTopDown {

    @Test
    public void mergeNULLNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = null;
            int[] merged = ProgramStubForMerge.merge(arr1,arr2);
            assertEquals(null, merged);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeNULLEmpty() {
        try {
            int[] arr1 = new int[0];
            int[] arr2 = null;
            int[] merged = ProgramStubForMerge.merge(arr1,arr2);
            assertNotNull(merged);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeEmptyNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = new int[0];
            int[] merged = ProgramStubForMerge.merge(arr1,arr2);
            assertNotNull(merged);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeEmptyEmpty() {
        try {
            int[] arr1 = new int[0];
            int[] arr2 = new int[0];
            int[] merged = ProgramStubForMerge.merge(arr1,arr2);
            assertNotNull(merged);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeNULLNotNULL() {
        try {
            int[] arr1 = {6,2,8};
            int[] arr2 = null;
            int[] arr1Sorted = {2,6,8};
            int[] merged = ProgramStubForMerge.merge(arr1,arr2);
            for (int i = 0; i < merged.length; i++) {
                assertEquals(arr1Sorted[i], merged[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeNotNULLNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = {6,2,8};
            int[] arr2Sorted = {2,6,8};
            int[] merged = ProgramStubForMerge.merge(arr1,arr2);
            for (int i = 0; i < merged.length; i++) {
                assertEquals(arr2Sorted[i], merged[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void merge() {
        try {
            int[] arr1 = {71,12,55,73};
            int[] arr2 = {18,14,2,72};
            int[] merged = {2,12,14,18,55,71,72,73};
            int[] mergedAns = ProgramStubForMerge.merge(arr1,arr2);
            for (int i = 0; i < merged.length; i++) {
                assertEquals(merged[i],mergedAns[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeDiffSize() {
        try {
            int[] arr1 = {2,4,6};
            int[] arr2 = {5,3,7,9,1};
            int[] merged = {1,2,3,4,5,6,7,9};
            int[] mergedAns = ProgramStubForMerge.merge(arr1,arr2);
            for (int i = 0; i < merged.length; i++) {
                assertEquals(merged[i],mergedAns[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeSameArray() {
        try {
            int[] arr1 = {2,4,6};
            int[] arr2 = {2,4,6};
            int[] merged = {2,2,4,4,6,6};
            int[] mergedAns = ProgramStubForMerge.merge(arr1,arr2);
            for (int i = 0; i < merged.length; i++) {
                assertEquals(merged[i],mergedAns[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}

class ProgramStubForMerge extends Program {

    public static int[] sortArray(int[] arr) {
        if (arr == null) return null;
        int[] res = copyArr(arr);
        for(int i = 0; i < size(arr); i++)
            for (int j = 0; j < size(arr) - i - 1; j++)
                if (res[j] > res[j + 1]) {
                    int temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
        return res;
    }

    public static int[] merge(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return sortArray(ar2);
        if (ar2==null) return sortArray(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return sortArray(res);
    }
}
