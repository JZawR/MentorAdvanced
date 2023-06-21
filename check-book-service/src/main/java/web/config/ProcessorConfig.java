package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.model.Ebook;

import java.util.function.Function;

@Configuration
public class ProcessorConfig {

    @Bean
    public Function<Ebook, Ebook> processName() {
        return ebook -> new Ebook(ebook.Id(), ebook.name(), ebook.description(), "checked", ebook.price());
    }
}
