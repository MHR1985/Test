package converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumberToRomanNumeralTest {

    @Test
    public void mustBeAbleToCreateConverter() {
        // Arrange

        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();

        // Assert
        assertNotNull(c);
    }

    @Test
    public void oneMustGiveI() {
        // Arrange
        int input = 1;
        String expected = "I";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void twoMustGiveII() {
        // Arrange
        int input = 2;
        String expected = "II";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void threeMustGiveIII() {
        // Arrange
        int input = 3;
        String expected = "III";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void fourMustGiveIV() {
        // Arrange
        int input = 4;
        String expected = "IV";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void fiveMustGiveV() {
        // Arrange
        int input = 5;
        String expected = "V";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void sixMustGiveVI() {
        // Arrange
        int input = 6;
        String expected = "VI";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }
    @Test
    public void sevenMustGiveVII() {
        // Arrange
        int input = 7;
        String expected = "VII";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void eightMustGiveVIII() {
        // Arrange
        int input = 8;
        String expected = "VIII";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void nineMustGiveIX() {
        // Arrange
        int input = 9;
        String expected = "IX";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }
    @Test
    public void tenMustGiveX() {
        // Arrange
        int input = 10;
        String expected = "X";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void elevenMustGiveXI() {
        // Arrange
        int input = 11;
        String expected = "XI";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void _66MustGiveLXVI() {
        // Arrange
        int input = 66;
        String expected = "LXVI";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void _1787MustGiveMDCCLXXXVII() {
        // Arrange
        int input = 1787;
        String expected = "MDCCLXXXVII";
        // Act
        RomanNumeralsConverter c = new RomanNumeralsConverter();
        String result = c.Convert(input);

        // Assert
        assertEquals(expected,result);
    }


}