/*
 * Copyright © 2022 Techgentsia  Software Technologies Private Limited - All rights reserved.
 *
 * This software is produced by Techgentsia. This is Proprietary and confidential
 * Unauthorized redistribution, reproduction, or usage of
 * this software in whole or in part without the express
 * written consent of Techgentsia is strictly prohibited.
 * Author - <Dony> e-mail - <dony@techgentsia.com> ,  <2/27/2023>
 */

package com.ikm.ikmdemo.validator.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = com.ikm.ikmdemo.validator.validator.IsBetween.class)
public @interface IsBetween {

    double from();

    String message() default "";

    double to();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
