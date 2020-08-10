package ru.inno.stc.soapclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import ru.inno.stc.soapclient.gen.AdditionInput;
import ru.inno.stc.soapclient.gen.Output;
import ru.inno.stc.soapclient.gen.SubtractionInput;

public class Client extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(Client.class);

    public Output addition(int number1, int number2) {

        AdditionInput request = new AdditionInput();
        request.setNumber1(number1);
        request.setNumber2(number2);

        log.info("Операция сложения для чисел {} и {}", number1, number2);
        return (Output) getWebServiceTemplate().marshalSendAndReceive(request);
    }


    public Output substraction(int number1, int number2) {

        SubtractionInput request = new SubtractionInput();
        request.setNumber1(number1);
        request.setNumber2(number2);

        log.info("Операция вычитания для чисел {} и {}", number1, number2);

        return (Output) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
