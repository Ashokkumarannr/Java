package com.example.weather_app.controller;

import com.example.weather_app.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    @Value("${api.key}")
    private String apiKey;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam("city") String city, Model model) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();

        try {
            WeatherResponse weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);

            if (weatherResponse != null) {
                model.addAttribute("city", weatherResponse.getName());
                model.addAttribute("country", weatherResponse.getSys().getCountry());
                model.addAttribute("weatherDescription", weatherResponse.getWeather().get(0).getDescription());
                model.addAttribute("temperature", weatherResponse.getMain().getTemp());
                model.addAttribute("humidity", weatherResponse.getMain().getHumidity());
                model.addAttribute("windSpeed", weatherResponse.getWind().getSpeed());
                String weatherIcon = "wi wi-owm-" + weatherResponse.getWeather().get(0).getId();
                model.addAttribute("weatherIcon", weatherIcon);
            } else {
                model.addAttribute("error", "City not found.");
            }
        } catch (HttpClientErrorException e) {
            // Handle 404 error
            if (e.getStatusCode().value() == 404) {
                model.addAttribute("error", "City not found.");
            } else {
                model.addAttribute("error", "An error occurred while retrieving weather data.");
            }
        }

        return "weather";
    }
}
