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

import com.ikm.ikmdemo.model.Coupon;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Random;

@RestController
@RequestMapping("/api/v0/coupon")
public class CouponController {

    @Operation
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping
    public Long create(@RequestBody @Valid Coupon coupon) {
        coupon.setId(Math.abs(new Random().nextLong()));
        return coupon.getId();
    }
}
