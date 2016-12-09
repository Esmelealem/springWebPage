package pl.quider.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.quider.web.service.impl.WebServiceClient;

@Configuration
public class AllegroWSConfig {

    @Bean
    public WebServiceClient webServiceClient() {
        WebServiceClient client = new WebServiceClient();

        return client;
    }
}
