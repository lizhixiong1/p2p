package com.bw.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.util.common.GetMessageCode;


@Controller
public class MessageController {
	
	
	@RequestMapping("sendSMS")
	@ResponseBody
	public String getMessage(String phone) {
		System.out.println(phone);
		return GetMessageCode.getCode(phone); 
	}
}
