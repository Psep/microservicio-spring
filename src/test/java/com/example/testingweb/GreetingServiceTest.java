package com.example.testingweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void testGreetMessage() {
        String message = greetingService.greet();
        assertThat(message).isEqualTo(Constantes.MENSAJE);
    }
    
}
