package com.aztec.object;

import com.aztec.dto.RabbitDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueueConfig {
    private String exchangeName;
    private String queueName;
    private String routingKey;
    private RabbitDTO rabbitDTO;
}
