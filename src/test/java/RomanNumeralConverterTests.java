import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralConverterTests {

    private RomanNumeralConverter converter;

    @Before
    public void setUp(){
        this.converter = new RomanNumeralConverter();
    }

    @Test
    public void shouldReturn_ThousandMultiplierMWhenGiven1000000(){
        //Given
        var valueUnderTest = 1000000;
        var expected = "_M_";

        //When
        var actual = converter.convert(valueUnderTest);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test(){
        //Given
        var valueUnderTest = 1400000;
        var expected = "_M_*_C__D_*";

        //When
        var actual = converter.convert(valueUnderTest);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void otherTest(){
        //Given
        var valueUnderTest = 1242345;
        var expected = "_M_*_C__C_**_X__L_*MMCCCXLV";

        //When
        var actual = converter.convert(valueUnderTest);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
