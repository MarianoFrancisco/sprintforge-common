package com.sprintforge.common.application.port.result;

import java.time.LocalDate;
import java.util.List;

public record EmployeeProductivityReportResult(
        LocalDate from,
        LocalDate to,
        List<EmployeeProductivityItem> employees,
        long totalEmployees
) {
}
