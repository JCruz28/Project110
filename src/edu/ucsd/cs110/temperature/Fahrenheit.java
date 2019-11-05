package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Celsius toCelsius() {
        Celsius result = new Celsius((float)((this.getValue() - 32) * (0.5555555555)));
        return result;
    }

    @Override
    public Fahrenheit toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}
