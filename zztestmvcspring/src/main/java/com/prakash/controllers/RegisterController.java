package com.prakash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prakash.dtos.LoginDto;
import com.prakash.dtos.RegisterDto;
import com.prakash.services.RegisterService;

@Controller
public class RegisterController {
	
	private RegisterService registerService ;
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public ModelAndView register() {
		System.out.println("Hey, this is register page!");
		RegisterDto registerDto= new RegisterDto();
		ModelAndView mv= new ModelAndView("register");
		mv.addObject("registerDtoObj",registerDto);
		return mv;
	}
	
	@RequestMapping(value="register-progress", method=RequestMethod.POST)
	public ModelAndView processRegister(RegisterDto registerDto){
		registerService.userRegistered(registerDto);
		LoginDto loginDto = new LoginDto();
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("loginObj", loginDto);
		return mv;
	}

	public RegisterService getRegisterService() {
		return registerService;
	}

	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	
}
