/*
 * Copyright © 2022 Techgentsia  Software Technologies Private Limited - All rights reserved.
 *
 * This software is produced by Techgentsia. This is Proprietary and confidential
 * Unauthorized redistribution, reproduction, or usage of
 * this software in whole or in part without the express
 * written consent of Techgentsia is strictly prohibited.
 * Author - <Dony> e-mail - <dony@techgentsia.com> ,  <2/27/2023>
 */

package com.ikm.ikmdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ikm.ikmdemo.validator.annotation.IsBetween;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

@Data
@Validated
public class Coupon {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Long id;

    @NotBlank
    @JsonProperty("coupon_code")
    String couponCode;

    @NotNull
    @IsBetween(from = 1, to = 100, message = "should be within 1 - 100")
    @JsonProperty("discount_amount")
    Double discountAmount;

    @Future
    @NotNull
    @JsonProperty("expiration_date")
    OffsetDateTime expirationDate;
}
