import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualArraysBottomUp {

    @Test
    public void equalArraysNULLNULL() {
        int[] arr1 = null;
        int[] arr2 = null;
        boolean equal = Program.equalArrays(arr1, arr2);
        assertTrue(equal);
    }

    @Test
    public void equalArraysNULLNotNULL() {
        int[] arr1 = null;
        int[] arr2 = {1,2,3};
        boolean equal = Program.equalArrays(arr1, arr2);
        assertFalse(equal);
    }

    @Test
    public void equalArraysNotNULLNULL() {
        int[] arr1 = {1,2,3};
        int[] arr2 = null;
        boolean equal = Program.equalArrays(arr1, arr2);
        assertFalse(equal);
    }

    @Test
    public void equalArrays() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        boolean equal = Program.equalArrays(arr1, arr2);
        assertTrue(equal);
    }

    @Test
    public void equalArraysFalse() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,4};
        boolean equal = Program.equalArrays(arr1, arr2);
        assertFalse(equal);
    }
}
