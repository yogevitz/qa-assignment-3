import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MaxValueIndexTopDown {

    @Test
    public void maxValueIndexNULL() {
        try {
            int maxValueIndex = ProgramStubForMaxValueIndex.maxValueIndex(null);
            assertEquals(-1, maxValueIndex);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void maxValueIndexEmpty() {
        try {
            int[] arr = new int[0];
            int maxValueIndex = ProgramStubForMaxValueIndex.maxValueIndex(arr);
            assertEquals(-1, maxValueIndex);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void maxValueIndex() {
        try {
            int[] arr = {3, 4, 5, 2, 7, 3};
            int maxValueIndex = ProgramStubForMaxValueIndex.maxValueIndex(arr);
            assertEquals(4, maxValueIndex);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}



class ProgramStubForMaxValueIndex extends Program{

    public static int maxValueIndex(int[] arr) {
        if (arr == null) return -1;
        if (size(arr) < 1) return -1;
        int res = arr[0];
        int resValue = (int) Double.NEGATIVE_INFINITY;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > resValue) {
                res = i;
                resValue = arr[i];
            }
        }
        return res;
    }

    public static int size(int[] arr) {
        return arr == null ? -1 : arr.length;
    }
}
