import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class EqualArraysBottomUp {

    @Test
    public void equalArraysNULLNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = null;
            boolean equal = Program.equalArrays(arr1, arr2);
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
            boolean equal = Program.equalArrays(arr1, arr2);
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
            boolean equal = Program.equalArrays(arr1, arr2);
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
            boolean equal = Program.equalArrays(arr1, arr2);
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
            boolean equal = Program.equalArrays(arr1, arr2);
            assertFalse(equal);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}
