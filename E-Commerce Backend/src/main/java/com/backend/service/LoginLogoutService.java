package com.backend.service;

import com.backend.models.CustomerDTO;
import com.backend.models.SellerDTO;
import com.backend.models.SessionDTO;
import com.backend.models.UserSession;


public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}
