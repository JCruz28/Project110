package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Celsius toCelsius() {
        return this;
    }

    @Override
    public Fahrenheit toFahrenheit() {
        Fahrenheit result = new Fahrenheit((float) ((this.getValue() * (1.8)) + 32));
        return result;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}