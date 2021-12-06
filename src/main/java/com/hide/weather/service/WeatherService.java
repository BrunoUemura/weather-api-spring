package com.hide.weather.service;

import com.hide.weather.model.Weather;
import com.hide.weather.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${api.url}")
    private String externalAPIUrl;

    public WeatherResponse findByCity(String city) {
        String apiUrl = this.externalAPIUrl + city;
        RestTemplate restTemplate = new RestTemplate();
        Weather weather = restTemplate.getForObject(apiUrl, Weather.class);

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
