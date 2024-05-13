package io.dongvelop.requestserver.activemq;

import io.dongvelop.requestserver.CommonMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2024. 05. 13
 * @description ActiveMQ Producer Runner
 */
@SpringBootTest
class ActiveMQProducerTest {

    @Autowired
    private ActiveMQProducer activeMQProducer;

    @Test
    @DisplayName("ActiveMQ를 이용해 메시지를 전송한다.")
    void activeMQSendMessage() {

        // given
        final var message = new CommonMessage("content");

        // when
        activeMQProducer.sendMessage(message);

        // then
    }
}