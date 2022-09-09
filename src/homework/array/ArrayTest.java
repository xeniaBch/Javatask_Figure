package homework.array;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayTest {

    int[] arr = {2, 5, 18, 50};
    @Test
    public void isMultiplyTestTrue(){
        assertTrue(Array.isMultiply(arr,36));
    }

    @Test
    public void isMultiplyTestFalse(){
        assertFalse(Array.isMultiply(arr,40));
    }
}
