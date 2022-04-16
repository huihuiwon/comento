package com.project.comento.dao.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.project.comento.model.ComentoModel;

@Mapper
public interface ComentoMapper {

	@Select("select code,thema_name from stock_info where \n"
			+ "code = (Select code from stock_kospi where code_name = #{codeName})")
	public ComentoModel getThemaName(String codeName);	
	
	
//	@Select("select sum(market_cap) from stock_kosdaq, stock_kospi, stock_finance"
//			+ " where stock_finance.code=if(#{market}='코스닥', stock_kosdaq.code, stock_kospi.code) &&"
//			+ "DATE=20210107"
//			+ " order by market_cap desc limit 5")
//	
	@Select("select sum(stock_finance.market_cap) FROM stock_finance where "
			+ "code in (select code from stock_info where stock_market = #{market}) "
			+ "and date = '20210107' order by market_cap desc limit 5")
	public String getMarketSum(String market);	
	
	
	@Select("select stock_finance.code, if(#{market}='코스닥', stock_kosdaq.code_name, stock_kospi.code_name)"
			+ " from stock_kosdaq, stock_kospi, stock_finance"
			+ " where stock_finance.code=if(#{market}='코스닥', stock_kosdaq.code, stock_kospi.code) &&"
			+ "DATE=20210107"
			+ " order by market_cap desc limit 30")
	public ComentoModel getCode30(String market);	
	
	@Select("select * from stock_info where code = #{code}")
	public ComentoModel getCodeDetail(String code);	
	
	@Select("SELECT stock_finance.code, market_class0, category1, code_name, roe FROM stock_finance, stock_kosdaq, stock_info\n" + 
			"WHERE stock_kosdaq.code=stock_finance.code && stock_info.code=stock_finance.code ORDER BY roe desc LIMIT 1")
	public ComentoModel getMaxRoe(String market);	
	
}
