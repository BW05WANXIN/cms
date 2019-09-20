package com.wanxin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 926474
 *
 */
@Controller
@RequestMapping("admin")
public class AdminController {
	
	@GetMapping("index")
	public String index() {
		return "admin/index";
	}

}
