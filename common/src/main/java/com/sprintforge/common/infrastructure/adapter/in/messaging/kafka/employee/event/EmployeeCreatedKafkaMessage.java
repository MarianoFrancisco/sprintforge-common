package com.sprintforge.common.infrastructure.adapter.in.messaging.kafka.employee.event;

import java.util.UUID;

public record EmployeeCreatedKafkaMessage(
        UUID employeeId,
        String cui,
        String email,
        String firstName,
        String lastName,
        String fullName,
        String status
) {
}
