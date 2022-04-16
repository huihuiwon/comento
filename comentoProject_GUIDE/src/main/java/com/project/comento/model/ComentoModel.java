package com.project.comento.model;

import java.util.List;

public class ComentoModel {
	String code;
	String thema_name;
    String market_cap;
    String stock_market;
    String category0;
    String market_class0;
    String market_class1;
    String category1;
    String audit;
    int margin;
    String remarks;
    String market;
    String thema_code;
    String marketSum;
    float ROE;
    String code_name;
    
    List codeList;

	public String getMarket_cap() {
		return market_cap;
	}

	public void setMarket_cap(String market_cap) {
		this.market_cap = market_cap;
	}
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getThemaName() {
		return thema_name;
	}

	public void setThemaName(String thema_name) {
		this.thema_name = thema_name;
	}

	public String getThema_name() {
		return thema_name;
	}

	public void setThema_name(String thema_name) {
		this.thema_name = thema_name;
	}

	public List getCodeList() {
		return codeList;
	}

	public void setCodeList(List codeList) {
		this.codeList = codeList;
	}
	
	public String getCodeName() {
		return code_name;
	}
	
	public void setCodeName(String code_name) {
		this.code_name=code_name;
	}
	
	
	public String getStockMarket() {
		return stock_market;
	}
	
	public void setStockMarket(String stock_market) {
		this.stock_market=stock_market;
	}
	
	public String getCategory0() {
		return category0;
	}
	
	public void setCategory0(String category0) {
		this.category0=category0;
	}
	
	public String getCategory1() {
		return category1;
	}
	
	public void setCategory1(String category1) {
		this.category1=category1;
	}
	
	public String getMarketClass0() {
		return market_class0;
	}
	
	public void setMarketClass0(String market_class0) {
		this.market_class0=market_class0;
	}
	
	public String getMarketClass1() {
		return market_class1;
	}
	
	public void setMargin(int margin) {
		this.margin=margin;
	}
	
	public int getMargin() {
		return margin;
	}
	
	public void setAudit(String audit) {
		this.audit=audit;
	}
	
	public String getAudit() {
		return audit;
	}
	
	public void setRemarks(String remarks) {
		this.remarks=remarks;
	}
	public String getRemarks() {
		return remarks;
	}
	
	public void setThemaCode(String thema_code) {
		this.thema_code=thema_code;
	}
	public String getThemaCode() {
		return thema_code;
	}
	
	public void setROE(float ROE) {
		this.ROE=ROE;
	}
	
	public float getROE() {
		return ROE;
	}
}
