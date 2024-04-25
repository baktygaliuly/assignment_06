package org.terenorda.main.ex3;

public class OpenWeatherMapAdapter implements WeatherAdapter {
    private OpenWeatherMapApi api;

    public OpenWeatherMapAdapter(OpenWeatherMapApi api) {
        this.api = api;
    }

    @Override
    public WeatherData getWeatherData(String city) {
        // Call the OpenWeatherMap API and map the response to WeatherData
        double temperature = api.getTemperature(city);
        double humidity = api.getHumidity(city);
        double windSpeed = api.getWindSpeed(city);
        return new WeatherData(temperature, humidity, windSpeed);
    }
}

