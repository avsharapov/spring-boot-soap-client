package ru.inno.stc.soapclient;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClientConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("ru.inno.stc.soapclient.gen");
        return marshaller;
    }

    @Bean
    public Client calculatorClient(Jaxb2Marshaller marshaller) {
        Client client = new Client();
        client.setDefaultUri("http://localhost:8080/ws/calculator");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
