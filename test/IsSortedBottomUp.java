import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class IsSortedBottomUp {

    @Test
    public void isSortedNULL() {
        try {
            int[] arr = null;
            assertTrue(Program.isSorted(arr));
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void isSortedEmpty() {
        try {
            int[] arr = {};
            assertTrue(Program.isSorted(arr));
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void isSorted() {
        try {
            int[] arr = {1,2,3};
            assertTrue(Program.isSorted(arr));
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void isSortedNotSorted() {
        try {
            int[] arr = {3,2,1};
            assertFalse(Program.isSorted(arr));
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}
