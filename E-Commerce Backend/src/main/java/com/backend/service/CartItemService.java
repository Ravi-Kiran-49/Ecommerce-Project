package com.backend.service;

import com.backend.models.CartDTO;
import com.backend.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
