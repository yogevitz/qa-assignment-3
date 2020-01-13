import org.junit.Test;

import static org.junit.Assert.*;

public class MergeBottomUp {

    @Test
    public void mergeNULLNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = null;
            int[] merged = Program.merge(arr1,arr2);
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
            int[] merged = Program.merge(arr1,arr2);
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
            int[] merged = Program.merge(arr1,arr2);
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
            int[] merged = Program.merge(arr1,arr2);
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
            int[] merged = Program.merge(arr1,arr2);
            for (int i = 0; i < merged.length; i++) {
                assertEquals(arr1[i], merged[i]);
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
            int[] merged = Program.merge(arr1,arr2);
            for (int i = 0; i < merged.length; i++) {
                assertEquals(arr2[i], merged[i]);
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
            int[] mergedAns = Program.merge(arr1,arr2);
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
            int[] mergedAns = Program.merge(arr1,arr2);
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
            int[] mergedAns = Program.merge(arr1,arr2);
            for (int i = 0; i < merged.length; i++) {
                assertEquals(merged[i],mergedAns[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}
