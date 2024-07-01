package com.example.dto;

import jakarta.validation.constraints.Min;

public class ItemDto {

    @Min(value = 1, message = "{error.itemDTO}")
	private Long itemId;

	public Long getItemId() {
		return itemId;
	}

}
