package io.dongvelop.responseserver.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2024. 05. 06
 * @description Kafka Consumer
 */
@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "dongyeop", groupId = "group_1")
    public <T> void listen(final ConsumerRecord<String, T> data) {
        log.info("data[{}]", data);

        final T value = data.value();
        log.info("value[{}]", value);
    }
}
