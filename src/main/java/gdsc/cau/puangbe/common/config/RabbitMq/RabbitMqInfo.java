package gdsc.cau.puangbe.common.config.RabbitMq;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
@ConfigurationProperties(prefix = "rabbitmq")
public class RabbitMqInfo {

    /**
     * Exchange : Producer로부터 전달받은 메시지를 어떤 메시지 큐로 전송할 지 결정
     */
    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    /**
     * Routing : Exchange에서 해당하는 key에 맞게 Queue에 분배
     */
    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    /**
     * Queue : Consumer가 소비하기 전까지 메시지 보관
     */
    @Value("${rabbitmq.queue.name}")
    private String queueName;
}
