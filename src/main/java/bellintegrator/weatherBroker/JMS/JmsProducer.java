package bellintegrator.weatherBroker.JMS;

import bellintegrator.weatherBroker.view.WeatherView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.*;

@Component
public class JmsProducer {


    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(final WeatherView weatherView) {

            jmsTemplate.send(new MessageCreator(){
                @Override
                public Message createMessage(Session session) throws JMSException {
                    ObjectMessage objectMessage = session.createObjectMessage(weatherView);
                    return objectMessage;
                }
            });
        }

    }
