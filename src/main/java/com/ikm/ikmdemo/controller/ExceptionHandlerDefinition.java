/*
 * Copyright © 2022 Techgentsia  Software Technologies Private Limited - All rights reserved.
 *
 * This software is produced by Techgentsia. This is Proprietary and confidential
 * Unauthorized redistribution, reproduction, or usage of
 * this software in whole or in part without the express
 * written consent of Techgentsia is strictly prohibited.
 * Author - <Dony> e-mail - <dony@techgentsia.com> ,  <2/27/2023>
 */

package com.ikm.ikmdemo.controller;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionHandlerDefinition {

    @Data
    public static class Error {
        String message;
        List<WrongField> cause;
    }

    @Data
    public static class WrongField {
        String field;
        Object value;
        String cause;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Error> validationHandler(MethodArgumentNotValidException ve) {
        Error error = new Error();
        error.setMessage("validation failed");
        error.setCause(ve.getFieldErrors().stream().map(err -> {
            WrongField field = new WrongField();
            field.setField(err.getField());
            field.setValue(err.getRejectedValue());
            field.setCause(err.getCode());
            return field;
        }).collect(Collectors.toList())
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
