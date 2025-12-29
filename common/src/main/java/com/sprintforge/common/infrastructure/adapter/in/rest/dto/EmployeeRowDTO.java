package com.sprintforge.common.infrastructure.adapter.in.rest.dto;

import java.time.LocalDate;
import java.util.UUID;

public record EmployeeRowDTO(
        UUID employeeId,
        String cui,
        String fullName,
        LocalDate eventDate
) {
}