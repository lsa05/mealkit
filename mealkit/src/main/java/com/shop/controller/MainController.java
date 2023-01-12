package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	//상품 전체 리스트
	@RequestMapping("/shop")
	public String shop(Model model) {
		
		return "shop";
	}
	
	//상품 상세 보기
	@RequestMapping("/product_single")
	public String product_single(Model model) {
		
		return "product_single";
	}
	
	
}
