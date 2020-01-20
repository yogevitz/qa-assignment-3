import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CopyArrTopDown {

    @Test
    public void copyArrNULL() {
        try {
            int[] newArr = ProgramStubForCopyArr.copyArr(null);
            assertEquals(newArr, null);
        } catch (Error e) {
            fail("should not throw error");
        }
    }

    @Test
    public void copyArrEmpty() {
        try {
            int[] arr = new int[0];
            int[] newArr = ProgramStubForCopyArr.copyArr(arr);
            assertEquals(newArr.length, arr.length);
        } catch (Error e) {
            fail("should not throw error");
        }
    }

    @Test
    public void copyArr() {
        try {
            int[] arr = {1,2,3};
            int[] newArr = ProgramStubForCopyArr.copyArr(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(newArr[i], arr[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}

class ProgramStubForCopyArr extends Program {

    public static int[] copyArr(int[] arr) {
        if (arr == null) return null;
        int[] res = new int[size(arr)];
        for(int i=0; i<size(arr); i++)
            res[i] = arr[i];
        return res;
    }

    public static int size(int[] arr) {
        return arr == null ? -1 : arr.length;
    }
}
