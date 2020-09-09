package converter;

public class TemperatureConverter {
    public double ConvertToCelcius(double zeroFahrenheit) {
        var celcius = (zeroFahrenheit-32)/1.8;
        var celciusRoundedToDouble = (double) Math.round(celcius*100)/100;
        return celciusRoundedToDouble;

    }

    public double ConvertToFahrenheit(double celsius) {
        var fahrenheit = (celsius*1.8)+32;
        return (double) Math.round(fahrenheit*100)/100;
    }
}
