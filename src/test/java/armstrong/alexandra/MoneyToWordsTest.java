package armstrong.alexandra;

import org.junit.Test;

import static armstrong.alexandra.MoneyToWords.*;
import static org.junit.Assert.assertEquals;

public class MoneyToWordsTest {

    @Test
    public void breakHundredsTest(){
        breakHundreds(6547);
        String actual = getSb().toString();
        String expected = " five-hundred and";
        assertEquals(expected, actual);
    }

    @Test
    public void breakTensTest(){
        breakTens(612);
        String actual = getSb().toString();
        String expected = " twelve";
        assertEquals(expected, actual);
    }

    @Test
    public void breakOnesTest(){
        breakOnes(324);
        String actual = getSb().toString();
        String expected = " four";
        assertEquals(expected, actual);
    }

}
