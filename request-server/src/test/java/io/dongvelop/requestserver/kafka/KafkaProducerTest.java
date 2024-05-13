package io.dongvelop.requestserver.kafka;

import io.dongvelop.requestserver.CommonMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2024. 05. 06
 * @description Kafka Producer Runner
 */
@SpringBootTest
class KafkaProducerTest {

    @Autowired
    private KafkaProducer kafkaProducer;

    @Test
    @DisplayName("카프카를 이용해 문자열 데이터를 전송한다.")
    void kafkaMessageSendString() {

        // given
        final String data = "hello dongyeop";

        // when
        kafkaProducer.send(data);

        // then
    }


    @Test
    @DisplayName("카프카를 이용해 객체 데이터를 전송한다.")
    void kafkaMessageSendObject() {

        // given
        final var message = new CommonMessage("content");

        // when
        kafkaProducer.send(message);

        // then
    }
}