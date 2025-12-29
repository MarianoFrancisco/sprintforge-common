package com.sprintforge.common.application.port.result;

import java.time.LocalDate;
import java.util.UUID;

public record EmployeeRow(
        UUID employeeId,
        String cui,
        String fullName,
        LocalDate eventDate
) {
}