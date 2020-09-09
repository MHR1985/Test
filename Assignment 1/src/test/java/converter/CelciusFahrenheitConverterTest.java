package converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CelciusFahrenheitConverterTest {

    @Test
    public void mustBeAbleToCreateConverter() {
        // Arrange

        // Act
        TemperatureConverter c = new TemperatureConverter();

        // Assert
        assertNotNull(c);
    }

    @Test
    public void _0fahrenheitToCelcius() {
        // Arrange
        double Fahrenheit = 0;
        double expected = -17.78;
        // Act
        TemperatureConverter c = new TemperatureConverter();

        // Assert
        assertEquals(expected,c.ConvertToCelcius(Fahrenheit));
    }

    @Test
    public void _32fahrenheitToCelcius() {
        // Arrange
        double Fahrenheit = 32;
        double expected = 0;
        // Act
        TemperatureConverter c = new TemperatureConverter();

        // Assert
        assertEquals(expected,c.ConvertToCelcius(Fahrenheit));
    }

    @Test
    public void _212fahrenheitToCelcius() {
        // Arrange
        double Fahrenheit = 212;
        double expected = 100;
        // Act
        TemperatureConverter c = new TemperatureConverter();

        // Assert
        assertEquals(expected,c.ConvertToCelcius(Fahrenheit));
    }

    @Test
    public void _0CelsiusToFahrenheit() {
        // Arrange
        double celsius = 0;
        double expected = 32;
        // Act
        TemperatureConverter c = new TemperatureConverter();

        // Assert
        assertEquals(expected,c.ConvertToFahrenheit(celsius));
    }
    @Test
    public void _100CelsiusToFahrenheit() {
        // Arrange
        double celsius = 100;
        double expected = 212;
        // Act
        TemperatureConverter c = new TemperatureConverter();

        // Assert
        assertEquals(expected,c.ConvertToFahrenheit(celsius));
    }

    @Test
    public void _37CelsiusToFahrenheit() {
        // Arrange
        double celsius = 37;
        double expected = 98.60;
        // Act
        TemperatureConverter c = new TemperatureConverter();

        // Assert
        assertEquals(expected,c.ConvertToFahrenheit(celsius));
    }



}
