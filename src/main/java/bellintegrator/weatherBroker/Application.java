package bellintegrator.weatherBroker;

import bellintegrator.weatherBroker.configuration.AppConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;

@ImportResource("spring_mvc_config.xml")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);
    }

}

