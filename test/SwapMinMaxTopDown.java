import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class SwapMinMaxTopDown {

    @Test
    public void swapMinMaxNULL() {
        try {
            int[] swap = ProgramStubForSwapMinMax.swapMinMax(null);
            assertEquals(null,swap);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMaxEmpty() {
        try {
            int[] arr = {};
            int[] swap = ProgramStubForSwapMinMax.swapMinMax(arr);
            assertEquals(null,swap);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMax() {
        try {
            int[] arr = {6,2,8,1,3,9};
            int[] swap = {6,2,8,9,3,1};
            int[] ans = ProgramStubForSwapMinMax.swapMinMax(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(swap[i],ans[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMaxRepeatedMin() {
        try {
            int[] arr = {6,1,2,8,1,3,9};
            int[] swap = {6,9,2,8,1,3,1};
            int[] ans = ProgramStubForSwapMinMax.swapMinMax(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(swap[i],ans[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMaxRepeatedMax() {
        try {
            int[] arr = {6,2,9,8,1,3,9};
            int[] swap = {6,2,1,8,9,3,9};
            int[] ans = ProgramStubForSwapMinMax.swapMinMax(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(swap[i],ans[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMaxRepeatedMinRepeatedMax() {
        try {
            int[] arr = {6,2,1,8,1,9,3,9};
            int[] swap = {6,2,9,8,1,1,3,9};
            int[] ans = ProgramStubForSwapMinMax.swapMinMax(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(swap[i],ans[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}

class ProgramStubForSwapMinMax extends Program {

    public static int[] swapMinMax(int[] arr) {
        int[] res = copyArr(arr);
        int minInd = minValueIndex(arr);
        int maxInd = maxValueIndex(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    public static int[] copyArr(int[] arr) {
        if (arr == null) return null;
        int[] res = new int[size(arr)];
        for (int i = 0; i < size(arr); i++) {
            res[i] = arr[i];
        }
        return res;
    }

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
