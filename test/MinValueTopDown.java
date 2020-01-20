import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueTopDown {

    @Test (expected = NullPointerException.class)
    public void minValueNULL() {
        int[] arr = null;
        int ans = ProgramStubForMinValue.minValue(arr);
    }

    @Test
    public void minValue() {
        try {
            int[] arr = {7,3,6,2,6};
            int minValue = 2;
            int ans = ProgramStubForMinValue.minValue(arr);
            assertEquals(minValue,ans);
        } catch (Exception e){
            fail("should not throw error");
        }
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void minValueEmpty() {
        int[] arr = new int[0];
        int ans = ProgramStubForMinValue.minValue(arr);
    }

    @Test
    public void minValueMinus() {
        try {
            int[] arr = {7,-3,6,2,6};
            int minValue = -3;
            int ans = ProgramStubForMinValue.minValue(arr);
            assertEquals(minValue,ans);
        } catch (Exception e){
            fail("should not throw error");
        }
    }
}


class ProgramStubForMinValue extends Program {

    public static int minValue(int[] arr) {
        int ind = minValueIndex(arr);
        return arr[ind];
    }

    public static int minValueIndex(int[] arr) {
        if (arr==null) return -1;
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
}
