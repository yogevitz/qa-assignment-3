import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MaxValueTopDown {

    @Test (expected = NullPointerException.class)
    public void maxValueNULL() {
        int[] arr = null;
        int ans = ProgramStubForMaxValue.maxValue(arr);
    }

    @Test
    public void maxValue() {
        try {
            int[] arr = {5,7,3,6,2,6};
            int maxValue = 7;
            int ans = ProgramStubForMaxValue.maxValue(arr);
            assertEquals(maxValue,ans);
        } catch (Exception e){
            fail("should not throw error");
        }
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void maxValueEmpty() {
        int[] arr = new int[0];
        int ans = ProgramStubForMaxValue.maxValue(arr);
    }

    @Test
    public void maxValueMinus() {
        try {
            int[] arr = {5,7,-3,6,2,6};
            int maxValue = 7;
            int ans = ProgramStubForMaxValue.maxValue(arr);
            assertEquals(maxValue,ans);
        } catch (Exception e){
            fail("should not throw error");
        }
    }
}


class ProgramStubForMaxValue extends Program {

    public static int maxValue(int[] arr) {
        int ind = maxValueIndex(arr);
        return arr[ind];
    }

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
}
