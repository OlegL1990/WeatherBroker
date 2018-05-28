package bellintegrator.weatherBroker.JMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class JmsProducer {


    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(String dest, Object message){
        jmsTemplate.convertAndSend(dest,message);
    }
}