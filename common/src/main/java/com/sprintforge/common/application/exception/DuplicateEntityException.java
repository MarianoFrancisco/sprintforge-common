package com.sprintforge.common.application.exception;

public class DuplicateEntityException extends BusinessException {
    public DuplicateEntityException() {
        super("Ya existe una entidad con los mismos atributos únicos.");
    }

    public DuplicateEntityException(String message) {
        super(message);
    }
}