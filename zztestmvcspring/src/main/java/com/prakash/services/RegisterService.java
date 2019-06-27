package com.prakash.services;

import org.springframework.stereotype.Service;

import com.prakash.dtos.RegisterDto;

@Service
public class RegisterService {
	public void userRegistered(RegisterDto registerDto){
		System.out.println("Hey, " + registerDto.getFirstName() + " "+ registerDto.getLastName() + ", it's a wonderful day isn't it?"); 
		System.out.println("Your information is: ");
		System.out.println(registerDto.toString());
		
	}
}
