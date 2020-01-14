import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MaxValueBottomUp {

    @Test (expected = NullPointerException.class)
    public void maxValueNULL() {
        int[] arr = null;
        int ans = Program.maxValue(arr);
    }

    @Test
    public void maxValue() {
        try {
            int[] arr = {5,7,3,6,2,6};
            int maxValue = 7;
            int ans = Program.maxValue(arr);
            assertEquals(maxValue,ans);
        } catch (Exception e){
            fail("should not throw error");
        }
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void maxValueEmpty() {
        int[] arr = new int[0];
        int ans = Program.maxValue(arr);
    }

    @Test
    public void maxValueMinus() {
        try {
            int[] arr = {5,7,-3,6,2,6};
            int maxValue = 7;
            int ans = Program.maxValue(arr);
            assertEquals(maxValue,ans);
        } catch (Exception e){
            fail("should not throw error");
        }
    }
}
