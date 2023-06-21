package web.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import web.model.Ebook;

import java.util.function.Supplier;

@Configuration
@EnableScheduling
public class RabbitMQConfig {

    @Bean
    public Supplier<Ebook> supplyName() {
        return () -> new Ebook(1, "name", "description", "unchecked", 100);
    }

//    @PollableBean
//    public Supplier<Flux<String>> supplyName() {
//        return () -> Flux.just("hello", "bye");
//    }

//    @Bean
//    public Supplier<Flux<String>> supplyName() {
//        return () -> Flux.fromStream(Stream.generate(new Supplier<String>() {
//            @Override
//            public String get() {
//                try {
//                    Thread.sleep(10000);
//                    return "Hello from Supplier";
//                } catch (Exception e) {
//                    return "0";
//                }
//            }
//        })).subscribeOn(Schedulers.boundedElastic()).share();
//    }

}
