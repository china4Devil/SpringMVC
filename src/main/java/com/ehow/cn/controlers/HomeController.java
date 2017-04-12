package com.ehow.cn.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehow.cn.entity.StockBasic;
import com.ehow.cn.service.StockBasicService;

/**
 * 用来处理
 * @author 浩
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	StockBasicService stockBasicServiceImpl;
	
	@RequestMapping("/home")
	public String homePage() {
		List<StockBasic> list = stockBasicServiceImpl.getStockBasicByCode("");
		
		System.out.println("init:"+list.size());
		return "home";
	}

}
