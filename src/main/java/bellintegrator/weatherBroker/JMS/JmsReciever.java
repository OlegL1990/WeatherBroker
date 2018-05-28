package bellintegrator.weatherBroker.JMS;

import bellintegrator.weatherBroker.dao.WeatherDao;
import bellintegrator.weatherBroker.model.WeatherEntity;
import bellintegrator.weatherBroker.view.WeatherView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.transaction.Transactional;


@Component
@Transactional
public class JmsReciever {
    @Autowired
    WeatherDao weatherDao;

    @JmsListener(destination ="java:/jms/topic/WeatherTopic")
    public void receiveMessage(WeatherView wv) throws JMSException {
        WeatherEntity weatherEntity = new WeatherEntity(wv);
        weatherDao.save(weatherEntity);

    }
}
