package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.model.Ebook;

import java.util.function.Consumer;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Consumer<Ebook> nameSink() {
        return System.out::println;
    }
}
