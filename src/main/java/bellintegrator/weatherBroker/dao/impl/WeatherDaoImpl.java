package bellintegrator.weatherBroker.dao.impl;

import bellintegrator.weatherBroker.dao.WeatherDao;
import bellintegrator.weatherBroker.model.WeatherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class WeatherDaoImpl implements WeatherDao {

    private final EntityManager em;
    @Autowired
    public WeatherDaoImpl(EntityManager em){
        this.em = em;
    }

    @Override
    public void save(WeatherEntity we) {
        em.persist(we);
    }


}
