package com.ehow.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehow.cn.entity.StockBasic;
import com.ehow.cn.entity.mapper.StockBasicMapper;
import com.ehow.cn.service.StockBasicService;

@Service
public class StockBasicServiceImpl implements StockBasicService {

	@Autowired
	StockBasicMapper stockBasicMapper;
	
	
	public void setStockBasicMapper(StockBasicMapper stockBasicMapper) {
		this.stockBasicMapper = stockBasicMapper;
	}


	@Override
	public List<StockBasic> getStockBasicByCode(String code) {
		List<StockBasic> list = stockBasicMapper.getStockBasicByCode("id");
		return list;
	}

}
