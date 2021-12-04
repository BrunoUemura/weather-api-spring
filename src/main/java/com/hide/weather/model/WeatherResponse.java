package com.hide.weather.model;

public class WeatherResponse {
    public String name;
    public String region;
    public String country;
    public String localtime;
    public double temp_c;
    public double temp_f;
    public double feelslike_c;
    public double feelslike_f;
    public String condition;
    public double humidity;

    public WeatherResponse(String name,
                           String region,
                           String country,
                           String localtime,
                           double temp_c,
                           double temp_f,
                           double feelslike_c,
                           double feelslike_f,
                           String condition,
                           double humidity) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.localtime = localtime;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.condition = condition;
        this.humidity = humidity;
    }
}
