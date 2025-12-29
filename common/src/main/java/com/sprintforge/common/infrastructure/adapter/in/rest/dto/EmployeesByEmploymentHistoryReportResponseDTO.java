package com.sprintforge.common.infrastructure.adapter.in.rest.dto;

import java.time.LocalDate;
import java.util.List;

public record EmployeesByEmploymentHistoryReportResponseDTO(
        LocalDate from,
        LocalDate to,
        long total,
        List<EmployeeRowDTO> employees
) {
}
