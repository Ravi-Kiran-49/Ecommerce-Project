package com.backend.service;

import java.util.List;

import com.backend.controller.ProductNotFound;
import com.backend.exception.CartItemNotFound;
import com.backend.models.Cart;
import com.backend.models.CartDTO;
import com.backend.models.CartItem;




public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}
