package com.prakash.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean isLoginValid(String username,String password){
		if (username.equals("prakash")&& password.equals("prakash")){
			return true;
		}else{
			return false;
		}
	}
}
