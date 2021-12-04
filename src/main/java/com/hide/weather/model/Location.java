package com.hide.weather.model;

public class Location {
    public String name;
    public String region;
    public String country;
    public double lat;
    public double lon;
    public String tz_id;
    public int localtime_epoch;
    public String localtime;

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getTz_id() {
        return tz_id;
    }

    public int getLocaltime_epoch() {
        return localtime_epoch;
    }

    public String getLocaltime() {
        return localtime;
    }
}
