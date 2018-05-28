package bellintegrator.weatherBroker.controller;

import bellintegrator.weatherBroker.model.WeatherEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface WeatherController {
    /**
     * Запросить погоду для города(city) и сохранить в DB
     *
     * @param city
     * @return статус HTTP запроса
     */
    public ResponseEntity<Void> submitWeatherForCity(@RequestParam String city);

    /**
     * Получить из DB список записей WeatherEntity для города(city)
     *
     * @param city
     * @return статус HTTP запроса, List<WeatherEntity>
     */
    public ResponseEntity<List<WeatherEntity>> getWeatherForCity(@PathVariable("city") String city);
}
