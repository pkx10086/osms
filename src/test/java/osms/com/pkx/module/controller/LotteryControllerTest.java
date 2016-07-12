package osms.com.pkx.module.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pkx.module.entity.Lottery;
import com.pkx.module.enums.LotteryType;
import com.pkx.module.service.LotteryService;

import common.util.HttpClientUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/mybaits-config.xml","classpath:config/spring-mvc.xml","classpath:config/spring-mybaits.xml"})
public class LotteryControllerTest {
	@Resource
	private LotteryService lotteryService;
	@Test
	public void addLottery(){
		//String lotteryType = request.getParameter("lotteryType");
		String lotteryType="5";
		//查询种类
		String url="http://api.avatardata.cn/Lottery/List";
		Map<String,String> params = new HashMap<String,String>();
		params.put("key", "8fd52d9938ab4a319bcdc53dd182bf1b");
		params.put("lotterytype", lotteryType);
		String str = HttpClientUtil.doPost(url,params);
		JSONObject jsb = JSONObject.parseObject(str);
		
		JSONArray jarray = jsb.getJSONArray("result");
		Lottery lottery = null;
	
		List<Lottery> lotterys = new ArrayList<Lottery>();
		for(int i=0;i<jarray.size();i++){
			lottery = new Lottery();
			JSONObject jsbt = jarray.getJSONObject(i);
			String lotteryName=jsbt.getString("lotteryName");
			String lotteryCode= jsbt.getString("lotteryCode");
			lottery.setId(UUID.randomUUID().toString());
			lottery.setLotteryName(lotteryName);
			lottery.setLotteryCode(lotteryCode);
			lottery.setLotteryType(lotteryType);
			lottery.setCreateTime(new Date());
			lottery.setSort(Long.valueOf(lotteryType));
			lotterys.add(lottery);
		}
		lotteryService.batchAdd(lotterys);
		System.out.println("str::"+lotterys);
		
	}
	
	
	@Test
	public void getLottery(){
		
		List<Lottery> lotterys = this.lotteryService.getLottery(LotteryType.NATIONAL_LOTTERY.getValue());
		System.out.println(lotterys.toString());
	}

}
