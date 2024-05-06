package io.dongvelop.requestserver.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2024. 05. 06
 * @description Kafka Producer Component
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaProducer {

    @Value("${message.topic}")
    private String topic;

    private final KafkaTemplate<String, Object> kafkaTemplate;

    /**
     * 해당 토픽에 인자로 넘어온 데이터를 전달
     */
    public <T> void send(final T data) {
        log.info("data[{}]", data);
        kafkaTemplate.send(topic, data);
    }
}
