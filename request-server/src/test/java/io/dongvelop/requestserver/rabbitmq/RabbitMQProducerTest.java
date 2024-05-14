package io.dongvelop.requestserver.rabbitmq;

import io.dongvelop.requestserver.CommonMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2024. 05. 14
 * @description RabbitMQ Producer Test
 */
@SpringBootTest
class RabbitMQProducerTest {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @Test
    @DisplayName("RabbitMQ를 이용해 메시지를 전송한다.")
    void sendMessage() {

        // given
        final var message = new CommonMessage("content");

        // when
        rabbitMQProducer.sendMessage(message);

        // then
    }
}