import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueIndexTopDown {

    @Test
    public void minValueIndexNULL() {
        try {
            int minValueIndex = ProgramStubForMinValue.minValueIndex(null);
            assertEquals(-1, minValueIndex);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void minValueIndexEmpty() {
        try {
            int[] arr = new int[0];
            int minValueIndex = ProgramStubForMinValue.minValueIndex(arr);
            assertEquals(-1, minValueIndex);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void minValueIndex() {
        try {
            int[] arr = {3, 4, 5, 2, 7, 3};
            int minValueIndex = ProgramStubForMinValue.minValueIndex(arr);
            assertEquals(3, minValueIndex);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}



class ProgramStubForMinValue extends Program{

    public static int minValueIndex(int[] arr) {
        if (arr == null) return -1;
        if (size(arr) < 1) return -1;
        int res = arr[0];
        int resValue = (int) Double.POSITIVE_INFINITY;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < resValue) {
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
