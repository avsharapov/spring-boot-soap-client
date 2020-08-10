package ru.inno.stc.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.inno.stc.soapclient.gen.Output;

@SpringBootApplication
public class SoapClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(Client client) {
        return args -> {
            int result1 = client.addition(4, 6).getResult();
            System.err.println(result1);
            int result2 = client.substraction(44, 55).getResult();
            System.err.println(result2);
        };
    }
}
