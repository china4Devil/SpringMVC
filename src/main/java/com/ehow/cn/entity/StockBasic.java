package com.ehow.cn.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StockBasic implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String name;
	private String industry;
	private String area;
	private BigDecimal pe;
	private BigDecimal outstanding;
	private BigDecimal totals; 
	private BigDecimal totalassets;
	private BigDecimal liquidassets ;
	private BigDecimal fixedassets ;
	private BigDecimal reserved ;
	private BigDecimal reservedpershare;
	private BigDecimal esp  ;
	private BigDecimal bvps ;
	private BigDecimal pb;
	private Date timetomarket;
	private BigDecimal undp;
	private BigDecimal perundp;
	private BigDecimal rev;
	private BigDecimal profit;
	private BigDecimal gpr;
	private BigDecimal npr;
	private int holders;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public BigDecimal getPe() {
		return pe;
	}
	public void setPe(BigDecimal pe) {
		this.pe = pe;
	}
	public BigDecimal getOutstanding() {
		return outstanding;
	}
	public void setOutstanding(BigDecimal outstanding) {
		this.outstanding = outstanding;
	}
	public BigDecimal getTotals() {
		return totals;
	}
	public void setTotals(BigDecimal totals) {
		this.totals = totals;
	}
	public BigDecimal getTotalassets() {
		return totalassets;
	}
	public void setTotalassets(BigDecimal totalassets) {
		this.totalassets = totalassets;
	}
	public BigDecimal getLiquidassets() {
		return liquidassets;
	}
	public void setLiquidassets(BigDecimal liquidassets) {
		this.liquidassets = liquidassets;
	}
	public BigDecimal getFixedassets() {
		return fixedassets;
	}
	public void setFixedassets(BigDecimal fixedassets) {
		this.fixedassets = fixedassets;
	}
	public BigDecimal getReserved() {
		return reserved;
	}
	public void setReserved(BigDecimal reserved) {
		this.reserved = reserved;
	}
	public BigDecimal getReservedpershare() {
		return reservedpershare;
	}
	public void setReservedpershare(BigDecimal reservedpershare) {
		this.reservedpershare = reservedpershare;
	}
	public BigDecimal getEsp() {
		return esp;
	}
	public void setEsp(BigDecimal esp) {
		this.esp = esp;
	}
	public BigDecimal getBvps() {
		return bvps;
	}
	public void setBvps(BigDecimal bvps) {
		this.bvps = bvps;
	}
	public BigDecimal getPb() {
		return pb;
	}
	public void setPb(BigDecimal pb) {
		this.pb = pb;
	}
	public Date getTimetomarket() {
		return timetomarket;
	}
	public void setTimetomarket(Date timetomarket) {
		this.timetomarket = timetomarket;
	}
	public BigDecimal getUndp() {
		return undp;
	}
	public void setUndp(BigDecimal undp) {
		this.undp = undp;
	}
	public BigDecimal getPerundp() {
		return perundp;
	}
	public void setPerundp(BigDecimal perundp) {
		this.perundp = perundp;
	}
	public BigDecimal getRev() {
		return rev;
	}
	public void setRev(BigDecimal rev) {
		this.rev = rev;
	}
	public BigDecimal getProfit() {
		return profit;
	}
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
	public BigDecimal getGpr() {
		return gpr;
	}
	public void setGpr(BigDecimal gpr) {
		this.gpr = gpr;
	}
	public BigDecimal getNpr() {
		return npr;
	}
	public void setNpr(BigDecimal npr) {
		this.npr = npr;
	}
	public int getHolders() {
		return holders;
	}
	public void setHolders(int holders) {
		this.holders = holders;
	}
	
}
