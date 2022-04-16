package com.project.comento.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.comento.dao.ComentoDao;
import com.project.comento.model.ComentoModel;

@RestController
@RequestMapping("/comento/biz")
public class comentoRestController {

	@Autowired
	ComentoDao ComentoDao;

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String sayHello() {
		return "Hello World!";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/code/theme", produces = "application/json")
	public HashMap getThemaName(@RequestParam String codeName) {
		ComentoModel data = ComentoDao.getThemaName(codeName);
		HashMap<String, Object> resultData = new HashMap<>();
		resultData.put("result", "sucess");
		resultData.put("description", "sucess");
		resultData.put("theme_name", data.getThema_name());
		return resultData;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/marketcap/sum", produces = "application/json")
	public HashMap getMarketSum(@RequestParam String market) {
		String data = ComentoDao.getMarketSum(market);
		HashMap<String, Object> resultData = new HashMap<>();
		resultData.put("result", "sucess");
		resultData.put("description", "sucess");
		resultData.put("market_sum", data);
		return resultData;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/code/30", produces = "application/json")
	public List getCode30(@RequestParam String market) {	
		ComentoModel data = ComentoDao.getCode30(market);
		HashMap<String, Object> resultData = new HashMap<>();
		List<String> list = new ArrayList<String>();
		resultData.put("result", "sucess");
		resultData.put("description", "sucess");
		resultData.put("code", data.getCode());
		resultData.put("code_name", data.getCodeName());

		list.add(data.getCode());
		list.add(data.getCodeName());
		return list;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/code/detail", produces = "application/json")
	public HashMap getCodeDetail(@RequestParam String code,String market) {
		ComentoModel data = ComentoDao.getCodeDetail(code);
		HashMap<String, Object> resultData = new HashMap<>();
		resultData.put("result", "success");
		resultData.put("description", "success");
		resultData.put("code",data.getCode());
		resultData.put("stock_market",data.getStockMarket());
		resultData.put("category0", data.getCategory0());
		resultData.put("market_class0", data.getMarketClass0());
		resultData.put("market_class1", data.getMarketClass1());
		resultData.put("category1", data.getCategory1());
		resultData.put("audit", data.getAudit());
		resultData.put("margin", data.getMargin());
		resultData.put("remarks", data.getRemarks());
		resultData.put("theme_name", data.getThema_name());
		resultData.put("theme_code", data.getThemaCode());
		
		return resultData;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/code/maxRoe", produces = "application/json")
	public HashMap getMaxRoe(@RequestParam String market) {
		ComentoModel data = ComentoDao.getMaxRoe(market);
		HashMap<String, Object> resultData = new HashMap<>();
		resultData.put("result", "success");
		resultData.put("description", "success");
		resultData.put("code",data.getCode());
		resultData.put("ROE", data.getROE());
		resultData.put("stock_market",data.getStockMarket());
		resultData.put("category0", data.getCategory0());
		resultData.put("market_class0", data.getMarketClass0());
		resultData.put("market_class1", data.getMarketClass1());
		resultData.put("category1", data.getCategory1());
		resultData.put("audit", data.getAudit());
		resultData.put("margin", data.getMargin());
		resultData.put("remarks", data.getRemarks());
		resultData.put("theme_name", data.getThema_name());
		resultData.put("theme_code", data.getThemaCode());
		
		return resultData;
	}
}
