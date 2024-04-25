package org.terenorda.main.ex3;

public class TestAdapter {

    public static void main(String[] args) {
        OpenWeatherMapApi owmp = new OpenWeatherMapApi();
        owmp.data();
        WeatherAdapter openWeatherMapAdapter = new OpenWeatherMapAdapter(owmp);

        WeatherData openWeatherMapData = openWeatherMapAdapter.getWeatherData("New York");

        displayWeatherData("OpenWeatherMap", openWeatherMapData);
    }

    private static void displayWeatherData(String provider, WeatherData weatherData) {
        System.out.println("Weather data from " + provider + ":");
        if (weatherData != null) {
            System.out.println("Temperature: " + weatherData.getTemperature());
            System.out.println("Humidity: " + weatherData.getHumidity());
            System.out.println("Wind Speed: " + weatherData.getWindSpeed());
        } else {
            System.out.println("Failed to retrieve weather data.");
        }
        System.out.println();
    }
}
