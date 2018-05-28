package bellintegrator.weatherBroker.service;

import bellintegrator.weatherBroker.model.WeatherEntity;
import bellintegrator.weatherBroker.view.WeatherView;

import java.util.List;

public interface WeatherService {
    /**
     * Отправить в JSM очередь сообщение
     * содержащее weatherView
     *
     * @param weatherView
     */
    public void send(WeatherView weatherView);

    /**
     * Получить List<WeatherEntity> по названию города(сity)
     *
     *
     * @param city
     */
    public List<WeatherEntity> loadByCity(String city);
}
