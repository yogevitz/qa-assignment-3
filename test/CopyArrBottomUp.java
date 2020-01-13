import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CopyArrBottomUp {

    @Test
    public void copyArrNULL() {
        try {
            int[] newArr = Program.copyArr(null);
            assertEquals(newArr, null);
        } catch (Error e) {
            fail("should not throw error");
        }
    }

    @Test
    public void copyArrEmpty() {
        try {
            int[] arr = new int[0];
            int[] newArr = Program.copyArr(arr);
            assertEquals(newArr.length, arr.length);
        } catch (Error e) {
            fail("should not throw error");
        }
    }

    @Test
    public void copyArr() {
        try {
            int[] arr = {1,2,3};
            int[] newArr = Program.copyArr(arr);
            for (int i = 0; i < arr.length; i++) {
                assertEquals(newArr[i], arr[i]);
            }
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}
