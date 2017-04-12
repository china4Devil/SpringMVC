package com.ehow.cn.service;

import java.util.List;

import com.ehow.cn.entity.StockBasic;

public interface StockBasicService {
	
	public List<StockBasic> getStockBasicByCode(String code);

}
