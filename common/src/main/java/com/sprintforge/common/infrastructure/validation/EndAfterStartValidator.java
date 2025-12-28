package com.sprintforge.common.infrastructure.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.reflect.RecordComponent;
import java.time.Instant;
import java.time.LocalDate;

public class EndAfterStartValidator implements ConstraintValidator<END_AFTER_START, Object> {

    private String startField;
    private String endField;
    private boolean allowEqual;

    @Override
    public void initialize(END_AFTER_START annotation) {
        this.startField = annotation.start();
        this.endField = annotation.end();
        this.allowEqual = annotation.allowEqual();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) return true;

        Object startObj = readValue(value, startField);
        Object endObj = readValue(value, endField);

        if (startObj == null || endObj == null) return true;

        if (startObj instanceof Instant start && endObj instanceof Instant end) {
            return allowEqual ? !end.isBefore(start) : end.isAfter(start);
        }

        if (startObj instanceof LocalDate start && endObj instanceof LocalDate end) {
            return allowEqual ? !end.isBefore(start) : end.isAfter(start);
        }

        return true;
    }

    private Object readValue(Object target, String fieldName) {
        try {
            for (RecordComponent rc : target.getClass().getRecordComponents()) {
                if (rc.getName().equals(fieldName)) {
                    return rc.getAccessor().invoke(target);
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
