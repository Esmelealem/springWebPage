package pl.quider.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.quider.web.service.impl.WebServiceAllegroImpl;

@Configuration
public class AllegroWSConfig {

    @Bean
    public WebServiceAllegroImpl webServiceClient() {
        WebServiceAllegroImpl client = new WebServiceAllegroImpl();

        return client;
    }
}
