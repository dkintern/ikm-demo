/*
 * Copyright © 2022 Techgentsia  Software Technologies Private Limited - All rights reserved.
 *
 * This software is produced by Techgentsia. This is Proprietary and confidential
 * Unauthorized redistribution, reproduction, or usage of
 * this software in whole or in part without the express
 * written consent of Techgentsia is strictly prohibited.
 * Author - <Dony> e-mail - <dony@techgentsia.com> ,  <2/27/2023>
 */

package com.ikm.ikmdemo.validator.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsBetween implements ConstraintValidator<com.ikm.ikmdemo.validator.annotation.IsBetween, Double> {

    private Double from;
    private Double to;

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext context) {
        return from <= value && value <= to;
    }

    @Override
    public void initialize(com.ikm.ikmdemo.validator.annotation.IsBetween constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        from = constraintAnnotation.from();
        to = constraintAnnotation.to();
    }
}
