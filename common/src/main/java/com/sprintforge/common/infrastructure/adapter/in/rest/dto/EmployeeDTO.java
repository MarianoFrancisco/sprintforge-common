package com.sprintforge.common.infrastructure.adapter.in.rest.dto;

import java.util.UUID;

public record EmployeeDTO(
        UUID id,
        String email,
        String fullName,
        String profileImage,
        String position
) {
}
