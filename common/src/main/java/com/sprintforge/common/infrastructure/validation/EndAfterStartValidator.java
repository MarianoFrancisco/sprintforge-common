package com.sprintforge.common.infrastructure.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.reflect.RecordComponent;
import java.time.Instant;

public class EndAfterStartValidator implements ConstraintValidator<END_AFTER_START, Object> {

    private String startField;
    private String endField;

    @Override
    public void initialize(END_AFTER_START annotation) {
        this.startField = annotation.start();
        this.endField = annotation.end();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) return true;

        Instant start = readInstant(value, startField);
        Instant end = readInstant(value, endField);

        if (start == null || end == null) return true;

        return end.isAfter(start);
    }

    private Instant readInstant(Object target, String fieldName) {
        try {
            for (RecordComponent rc : target.getClass().getRecordComponents()) {
                if (rc.getName().equals(fieldName)) {
                    Object v = rc.getAccessor().invoke(target);
                    return (v instanceof Instant i) ? i : null;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
