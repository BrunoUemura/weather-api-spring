# Weather API
This Weather API is built with Spring Boot

## Setup and Installation
### Install dependencies
```bash
mvn install
```

### Run
```bash
mvn spring-boot:run
```

## How it works
Send `GET` request to endpoints bellow:
- `http://localhost:8080/api/v1/weather`
- `http://localhost:8080/api/v1/weather/{city}`
### Example
`GET` - `http://localhost:8080/api/v1/weather`
```json
{
  "message": "Welcome to Weather API. Send a GET request to http://localhost:8080/api/v1/weather/moncton"
}
```

`GET` - `http://localhost:8080/api/v1/weather/moncton`
```json
{
  "name": "Moncton",
  "region": "New Brunswick",
  "country": "Canada",
  "localTime": "2021-12-03 22:11",
  "temperatureInC": -5.0,
  "temperatureInF": 23.0,
  "feelsLikeInC": -12.0,
  "feelsLikeInF": 9.8,
  "condition": "Partly cloudy",
  "humidity": 68.0
}
```

## Author
Bruno Hideki Uemura [linkedin](https://www.linkedin.com/in/bruno-hideki-uemura-918589139/), [Github](https://github.com/BrunoUemura)

