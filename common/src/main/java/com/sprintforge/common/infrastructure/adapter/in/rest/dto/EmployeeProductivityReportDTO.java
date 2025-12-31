package com.sprintforge.common.infrastructure.adapter.in.rest.dto;

import java.time.LocalDate;
import java.util.List;

public record EmployeeProductivityReportDTO(
        LocalDate from,
        LocalDate to,
        List<EmployeeProductivityItemDTO> employees,
        long totalEmployees
) {
}
