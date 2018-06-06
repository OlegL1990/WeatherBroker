package bellintegrator.weatherBroker.configuration;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.jms.ConnectionFactory;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Configuration
@RequestScoped
public class MessagingConfiguration {


    private static final String TOPIC = "java:/jms/topic/weatherTopic";
    private static final String CONNECTION = "java:comp/DefaultJMSConnectionFactory";

    @Resource(name = CONNECTION)
    private ConnectionFactory connectionFactory;
    /*@Bean
    public ActiveMQConnectionFactory connectionFactory()throws NamingException {
        ActiveMQConnectionFactory connectionFactory = InitialContext.doLookup(CONNECTION);

        return connectionFactory;
    }
    */

    @Bean
    public JmsTemplate jmsTemplate()throws NamingException{
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory);
        template.setDefaultDestinationName(TOPIC);
        return template;
    }

}
