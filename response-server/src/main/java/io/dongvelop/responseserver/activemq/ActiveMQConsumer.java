package io.dongvelop.responseserver.activemq;

import io.dongvelop.responseserver.CommonMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2024. 05. 13
 * @description ActiveMQ Consumer
 */
@Slf4j
@Component
public class ActiveMQConsumer {

    /**
     * Queue에서 메시지를 구독
     *
     * @param message 구독한 메시지를 담고 있는 MessageDto 객체
     */
    @JmsListener(destination = "${activemq.queue.name}")
    public void receiveMessage(final CommonMessage message) {
        log.info("message[{}]", message);
    }
}
