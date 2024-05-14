package io.dongvelop.responseserver.rabbitmq;

import io.dongvelop.responseserver.CommonMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2024. 05. 14
 * @description RabbitMQ Consumer
 */
@Slf4j
@Component
public class RabbitMQConsumer {

    /**
     * Queue에서 메시지를 구독
     *
     * @param message 구독한 메시지를 담고 있는 MessageDto 객체
     */
    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(CommonMessage message) {
        log.info("Received message: {}", message);
    }
}
