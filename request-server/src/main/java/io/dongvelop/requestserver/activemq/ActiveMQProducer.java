package io.dongvelop.requestserver.activemq;

import io.dongvelop.requestserver.CommonMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2024. 05. 13
 * @description ActiveMQ Producer
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ActiveMQProducer {

    @Value("${activemq.queue.name}")
    private String queueName;

    private final JmsTemplate jmsTemplate;

    /**
     * Queue로 메시지를 발행
     *
     * @param message 발행할 메시지의 DTO 객체
     */
    public void sendMessage(final CommonMessage message) {
        log.info("message[{}]", message);
        jmsTemplate.convertAndSend(queueName, message);
    }
}
