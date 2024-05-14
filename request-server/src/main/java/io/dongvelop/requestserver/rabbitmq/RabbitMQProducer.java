package io.dongvelop.requestserver.rabbitmq;

import io.dongvelop.requestserver.CommonMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2024. 05. 14
 * @description RabbitMQ Producer
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class RabbitMQProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    private final RabbitTemplate rabbitTemplate;

    /**
     * Queue로 메시지를 발행
     *
     * @param message 발행할 메시지의 DTO 객체
     */
    public void sendMessage(CommonMessage message) {
        log.info("message sent: {}", message.toString());
        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
    }
}
