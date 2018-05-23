package bellintegrator.weatherBroker.JMS;

import bellintegrator.weatherBroker.view.WeatherView;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class JmsReciever {
    @JmsListener(destination ="jms/topic/weather")
    public void receiveMessage(WeatherView wv) throws JMSException {
    }
}
