package com.sprintforge.common.infrastructure.adapter.in.messaging.kafka.project.event;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record ProjectCreatedKafkaMessage(
        String entity_type,
        String event_type,
        String message,
        Instant occurredAt,
        UUID projectId,
        String projectKey,
        String name,
        String description,
        String client,
        String area,
        BigDecimal budgetAmount,
        BigDecimal contractAmount,
        boolean isClosed,
        boolean isDeleted
) {
}
