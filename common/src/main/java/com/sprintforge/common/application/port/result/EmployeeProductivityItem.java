package com.sprintforge.common.application.port.result;

public record EmployeeProductivityItem(
        EmployeeResult employee,
        long workedStories,
        long completedStories,
        long pendingStories,
        long deliveredStoryPoints,
        long hoursWorked
) {
}
