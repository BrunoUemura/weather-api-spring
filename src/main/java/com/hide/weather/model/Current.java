package com.hide.weather.model;

public class Current {
    public int last_updated_epoch;
    public String last_updated;
    public int temp_c;
    public double temp_f;
    public int is_day;
    public Condition condition;
    public double wind_mph;
    public double wind_kph;
    public int wind_degree;
    public String wind_dir;
    public int pressure_mb;
    public double pressure_in;
    public int precip_mm;
    public int precip_in;
    public int humidity;
    public int cloud;
    public int feelslike_c;
    public double feelslike_f;
    public int vis_km;
    public int vis_miles;
    public int uv;
    public double gust_mph;
    public double gust_kph;

    public int getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public int getTemp_c() {
        return temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public int getIs_day() {
        return is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public double getWind_mph() {
        return wind_mph;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public int getPressure_mb() {
        return pressure_mb;
    }

    public double getPressure_in() {
        return pressure_in;
    }

    public int getPrecip_mm() {
        return precip_mm;
    }

    public int getPrecip_in() {
        return precip_in;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public int getFeelslike_c() {
        return feelslike_c;
    }

    public double getFeelslike_f() {
        return feelslike_f;
    }

    public int getVis_km() {
        return vis_km;
    }

    public int getVis_miles() {
        return vis_miles;
    }

    public int getUv() {
        return uv;
    }

    public double getGust_mph() {
        return gust_mph;
    }

    public double getGust_kph() {
        return gust_kph;
    }
}
