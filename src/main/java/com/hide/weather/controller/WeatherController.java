package com.hide.weather.controller;


import com.hide.weather.model.BaseResponse;
import com.hide.weather.model.WeatherResponse;
import com.hide.weather.service.WeatherService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
@AllArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping
    public ResponseEntity<BaseResponse> baseRoute() {
        BaseResponse baseResponse = new BaseResponse("Welcome to Weather API. Send a GET request to http://localhost:8080/api/v1/weather/california");
        return ResponseEntity.ok(baseResponse);
    }

    @GetMapping(path = "/{city}")
    public ResponseEntity<WeatherResponse> findByCity(@PathVariable String city) {
        String cityCapitalizedStr = city.substring(0, 1).toUpperCase() + city.substring(1);
        return ResponseEntity.ok(weatherService.findByCity(cityCapitalizedStr));
    }
}
