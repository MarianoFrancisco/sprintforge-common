package com.sprintforge.common.infrastructure.adapter.in.rest.dto;

public record EmployeeProductivityItemDTO(
        EmployeeDTO employee,
        long workedStories,
        long completedStories,
        long pendingStories,
        long deliveredStoryPoints
) {
}