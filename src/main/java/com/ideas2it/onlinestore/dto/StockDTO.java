/*
 * Copyright (c) 2022 Ideas2it, Inc.All rights are reserved.
 *
 * This document is protected by copyright. No part of this document may be
 * reproduced in any form by any means without prior written authorization of
 * Ideas2it and its licensors, if any.
 */
package com.ideas2it.onlinestore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * It represents the stock DTO.
 *
 * @author - arunkumar
 * @version - 1.0
 */
@Getter
@Setter
public class StockDTO {

	private long id;
	@NotBlank(message = "product name should not null")
	private String productName;
	@Min(0)
	private int quantity;
	@NotBlank(message = "product name should not null")
	private Date dateOfManufacture;
	@NotBlank(message = "product name should not null")
	private Date dateOfExpire;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private UserDTO seller;
	private ProductDTO product;
}