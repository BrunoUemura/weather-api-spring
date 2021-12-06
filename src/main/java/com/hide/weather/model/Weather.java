package com.hide.weather.model;

import lombok.Data;

@Data
public class Weather {
    public Location location;
    public Current current;
}

