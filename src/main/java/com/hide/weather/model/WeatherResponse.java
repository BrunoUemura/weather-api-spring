package com.hide.weather.model;

public class WeatherResponse {
    public String name;
    public String region;
    public String country;
    public String localTime;
    public double temperatureInC;
    public double temperatureInF;
    public double feelsLikeInC;
    public double feelsLikeInF;
    public String condition;
    public double humidity;

    public WeatherResponse(
            String name,
            String region,
            String country,
            String localTime,
            double temperatureInC,
            double temperatureInF,
            double feelsLikeInC,
            double feelsLikeInF,
            String condition,
            double humidity
    ) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.localTime = localTime;
        this.temperatureInC = temperatureInC;
        this.temperatureInF = temperatureInF;
        this.feelsLikeInC = feelsLikeInC;
        this.feelsLikeInF = feelsLikeInF;
        this.condition = condition;
        this.humidity = humidity;
    }
}
