package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	@RequestMapping("/product")
	public String product(Model model) {
		model.addAttribute("center", "product");
		return "index";
	}
	@RequestMapping("/detail")
	public String detail(Model model) {
		model.addAttribute("center", "detail");
		return "index";
	}
}
