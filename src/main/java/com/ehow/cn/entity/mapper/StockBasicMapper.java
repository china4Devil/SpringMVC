package com.ehow.cn.entity.mapper;

import java.util.List;

import com.ehow.cn.entity.StockBasic;

public interface StockBasicMapper {
	
	List<StockBasic> getStockBasicByCode(String code);
}
