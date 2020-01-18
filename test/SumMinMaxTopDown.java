import org.junit.Test;

import static org.junit.Assert.*;

public class SumMinMaxTopDown {

    @Test (expected = NullPointerException.class)
    public void sumMinMaxNULL() {
        int[] arr = null;
        int ans = ProgramStubForSubMinMax.sumMinMax(arr);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void sumMinMaxEmpty() {
        int[] arr = {};
        int ans = ProgramStubForSubMinMax.sumMinMax(arr);
    }

    @Test
    public void sumMinMax() {
        try {
            int[] arr = {2,3,7,2,4};
            int ans = ProgramStubForSubMinMax.sumMinMax(arr);
            int sumMinMax = 9;
            assertEquals(ans,sumMinMax);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}

class ProgramStubForSubMinMax extends Program {

    public static int maxValue(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minValue(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int sumMinMax(int[] arr) {
        return minValue(arr) + maxValue(arr);
    }
}