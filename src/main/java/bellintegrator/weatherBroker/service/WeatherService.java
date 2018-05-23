package bellintegrator.weatherBroker.service;

import bellintegrator.weatherBroker.JMS.JmsProducer;
import bellintegrator.weatherBroker.view.WeatherView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    JmsProducer jmsProducer;

    public void send(WeatherView wv){
        jmsProducer.sendMessage(wv);
    }
}
