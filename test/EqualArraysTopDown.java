import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class EqualArraysTopDown {

    @Test
    public void equalArraysNULLNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = null;
            boolean equal = ProgramStubForEqualArrays.equalArrays(arr1, arr2);
            assertTrue(equal);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void equalArraysNULLNotNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = {1,2,3};
            boolean equal = ProgramStubForEqualArrays.equalArrays(arr1, arr2);
            assertFalse(equal);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void equalArraysNotNULLNULL() {
        try {
            int[] arr1 = {1,2,3};
            int[] arr2 = null;
            boolean equal = ProgramStubForEqualArrays.equalArrays(arr1, arr2);
            assertFalse(equal);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void equalArrays() {
        try {
            int[] arr1 = {1,2,3};
            int[] arr2 = {1,2,3};
            boolean equal = ProgramStubForEqualArrays.equalArrays(arr1, arr2);
            assertTrue(equal);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void equalArraysFalse() {
        try {
            int[] arr1 = {1,2,3};
            int[] arr2 = {1,2,4};
            boolean equal = ProgramStubForEqualArrays.equalArrays(arr1, arr2);
            assertFalse(equal);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}

class ProgramStubForEqualArrays extends Program {

    public static int size(int[] arr) {
        return arr == null ? -1 : arr.length;
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
