package bellintegrator.weatherBroker;

import bellintegrator.weatherBroker.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);
    }

}
