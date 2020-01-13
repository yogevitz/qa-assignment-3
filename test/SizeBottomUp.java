import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SizeBottomUp {

    @Test (expected = NullPointerException.class)
    public void sizeNULL() {
        Program.size(null);
    }

    @Test
    public void size() {
        int[] arr = {1,2,3};
        assertEquals(Program.size(arr), arr.length);
    }
}
