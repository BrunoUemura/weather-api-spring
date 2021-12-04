package com.hide.weather.service;

import com.hide.weather.model.Weather;
import com.hide.weather.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public WeatherResponse findByCity(String city) {
        String externalAPIUrl = "http://apiurl";
        RestTemplate restTemplate = new RestTemplate();
        Weather weather = restTemplate.getForObject(externalAPIUrl, Weather.class);

        WeatherResponse weatherResponse = new WeatherResponse(
                weather.getLocation().getName(),
                weather.getLocation().getRegion(),
                weather.getLocation().getCountry(),
                weather.getLocation().getLocaltime(),
                weather.getCurrent().getTemp_c(),
                weather.getCurrent().getTemp_f(),
                weather.getCurrent().getFeelslike_c(),
                weather.getCurrent().getFeelslike_f(),
                weather.getCurrent().getCondition().getText(),
                weather.getCurrent().getHumidity()
        );

        return weatherResponse;
    }
}
