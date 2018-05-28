package bellintegrator.weatherBroker.configuration;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.naming.InitialContext;
import javax.naming.NamingException;

@Configuration
public class MessagingConfiguration {


    private static final String TOPIC = "java:/jms/topic/WeatherTopic";

    @Bean
    public ActiveMQConnectionFactory connectionFactory()throws NamingException {
        ActiveMQConnectionFactory connectionFactory = InitialContext.doLookup("java:/ConnectionFactory");

        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate()throws NamingException{
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        template.setDefaultDestinationName(TOPIC);
        return template;
    }

}
