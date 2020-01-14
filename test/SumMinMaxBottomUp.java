import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SumMinMaxBottomUp {

    @Test (expected = NullPointerException.class)
    public void sumMinMaxNULL() {
        int[] arr = null;
        int ans = Program.sumMinMax(arr);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void sumMinMaxEmpty() {
        int[] arr = {};
        int ans = Program.sumMinMax(arr);
    }

    @Test
    public void sumMinMax() {
        try {
            int[] arr = {2,3,7,2,4};
            int ans = Program.sumMinMax(arr);
            int sumMinMax = 9;
            assertEquals(ans,sumMinMax);
        } catch (Exception e) {
            fail("should not throw error");
        }
    }
}
