package com.sprintforge.common.application.port.result;

import java.time.LocalDate;
import java.util.List;

public record EmployeesByEmploymentHistoryReportResult(
        LocalDate from,
        LocalDate to,
        long total,
        List<EmployeeRow> employees
) {
}
