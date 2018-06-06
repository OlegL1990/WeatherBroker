package bellintegrator.weatherBroker.service.impl;

import bellintegrator.weatherBroker.JMS.JmsProducer;
import bellintegrator.weatherBroker.dao.WeatherDao;
import bellintegrator.weatherBroker.model.WeatherEntity;
import bellintegrator.weatherBroker.service.WeatherService;
import bellintegrator.weatherBroker.view.WeatherView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    JmsProducer jmsProducer;

    @Autowired
    WeatherDao weatherDao;

    public void send(WeatherView wv){
        jmsProducer.sendMessage("java:/jms/topic/weatherTopic",wv);
    }

    public List<WeatherEntity> loadByCity(String city){
       return weatherDao.loadByCity(city);
    }
}
