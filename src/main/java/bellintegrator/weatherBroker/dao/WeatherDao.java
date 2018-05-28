package bellintegrator.weatherBroker.dao;

import bellintegrator.weatherBroker.model.WeatherEntity;

import java.util.List;

public interface WeatherDao {

    /**
     * Сохранить в бд переданный экземпляр WeatherEntity
     *
     * @param weatherEntity
     */
     void save(WeatherEntity weatherEntity);

    /**
     * Получить List<WeatherEntity> по названию города(сity)
     *
     * @param city
     * @return Список List<WeatherEntity>
     */

    List<WeatherEntity> loadByCity( String city);
}

