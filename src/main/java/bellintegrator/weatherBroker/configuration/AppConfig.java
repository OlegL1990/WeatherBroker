package bellintegrator.weatherBroker.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MessagingConfiguration.class, MessagingListnerConfiguration.class})
public class AppConfig {

}