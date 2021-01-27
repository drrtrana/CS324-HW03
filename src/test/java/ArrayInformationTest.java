import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ArrayInformationTest {

    /*@Test
    void constructor_shouldNotAssignReferenceToField() {
        int[] array = { 1, 9, 4, 8, 6 };
        int[] arrayField = { 1, 9, 4, 8, 6 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertArrayEquals(arrayField, array);
    }*/

    /*@Test
    void findLeftBoundary_shouldReturnLeftBoundaryIfExists() {
        int[] array = { 1, 9, 4, 8, 6 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(4, aInfo.findLeftBoundary(5));
    }*/

    /*@Test
    void findLeftBoundary_shouldReturnNegOneIfNone() {
        int[] array = { 15, 9, 4, 8, 6, 10, 9, 20 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(-1, aInfo.findLeftBoundary(3));
    }*/

    /*@Test
    void findLeftBoundary_shouldFindLeftBoundaryIfEqual() {
        int[] array = { 15, 9, 4, 8, 6, 10, 20, 9};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(9, aInfo.findLeftBoundary(9));
    }*/

    /*@Test
    void findRightBoundary_shouldReturnRightBoundaryIfExists() {
        int[] array = { 1, 9, 4, 8, 6 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(6, aInfo.findRightBoundary(5));
    }*/

    /*@Test
    void findRightBoundary_shouldReturnNegOneIfNone() {
        int[] array = { 15, 9, 4, 8, 6, 10, 9, 20 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(-1, aInfo.findRightBoundary(22));
    }*/

    /*@Test
    void findRightBoundary_shouldFindRightBoundaryIfEqual() {
        int[] array = { 15, 9, 4, 8, 6, 10, 20, 9};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(9, aInfo.findRightBoundary(9));
    }*/
}