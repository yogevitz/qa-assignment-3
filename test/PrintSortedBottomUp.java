import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintSortedBottomUp {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test (expected = NullPointerException.class)
    public void printSortedNULL() {
        Program.printSorted(null);
        assertEquals("No array\n", outContent.toString());
    }

    @Test
    public void printSorted() {
        try {
            int[] arr = {4,9,5,7};
            Program.printSorted(arr);
            String arrString = "4 9 5 7 \n";
            String arrStringSorted = "4 5 7 9 \n";
            String printSortedArr = arrString + arrStringSorted + arrString;
            assertEquals(printSortedArr, outContent.toString());
        } catch (Exception e) {
            fail("Should not throw error");
        }
    }

    @Test
    public void printSortedEmpty() {
        try {
            int[] arr = new int[0];
            Program.printSorted(arr);
            String arrString = "\n";
            String arrStringSorted = "\n";
            String printSortedArr = arrString + arrStringSorted + arrString;
            assertEquals(printSortedArr, outContent.toString());
        } catch (Exception e) {
            fail("Should not throw error");
        }
    }
}