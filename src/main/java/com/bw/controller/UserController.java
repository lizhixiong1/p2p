package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bw.mapper.UserMapper;
import com.bw.pojo.User;
import com.util.common.PageUtil;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("login")
	public String login(User user) {
		System.out.println(user.toString());
		return "";
	}
	
	@RequestMapping("getList")
	public String list(String cpage,ModelMap map) {
		
		int count = userMapper.getConnt();
		int pageSize = 3;
		
		PageUtil pageUtil = new PageUtil(cpage, pageSize, count);
		
		List<User> list = userMapper.getList(pageUtil);
		map.put("list", list);
		map.put("pageUtil", pageUtil);
		return "view/list";
	}
}
