import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintSortedTopDown {

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

    @Test
    public void printSortedNULL() {
        ProgramStubForPrintSorted.printSorted(null);
        assertEquals("No array\n", outContent.toString());
    }

    @Test
    public void printSorted() {
        try {
            int[] arr = {4,9,5,7};
            ProgramStubForPrintSorted.printSorted(arr);
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
            ProgramStubForPrintSorted.printSorted(arr);
            String arrString = "\n";
            String arrStringSorted = "\n";
            String printSortedArr = arrString + arrStringSorted + arrString;
            assertEquals(printSortedArr, outContent.toString());
        } catch (Exception e) {
            fail("Should not throw error");
        }
    }
}

class ProgramStubForPrintSorted extends Program {

    public static void printSorted(int[] arr) {
        if (arr==null) {
            System.out.println("No array");
            return;
        }
        printArr(arr);
        printArr(sortArray(arr));
        printArr(arr);
    }

    public static int[] sortArray(int[] arr) {
        if (arr == null) return null;
        int[] res = copyArr(arr);
        for(int i=0; i<size(arr); i++)
            for (int j=0; j<size(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }

    public static void printArr(int[] arr) {
        for(int val: arr)
            System.out.print(val+" ");
        System.out.println();
    }
}
