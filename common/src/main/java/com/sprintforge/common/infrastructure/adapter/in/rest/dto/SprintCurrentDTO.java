package com.sprintforge.common.infrastructure.adapter.in.rest.dto;

import java.time.Instant;
import java.util.UUID;

public record SprintCurrentDTO(
        UUID sprintId,
        String name,
        String goal,
        String status,
        Instant startDate,
        Instant endDate
) {
}
