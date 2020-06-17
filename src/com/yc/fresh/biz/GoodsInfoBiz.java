package com.yc.fresh.biz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.yc.fresh.dao.GoodsInfoDao;
import com.yc.fresh.dao.GoodsTypeDao;
import com.yc.fresh.util.StringUtil;

public class GoodsInfoBiz {
	public Map<String, Object> finds(int rows) {
		GoodsInfoDao infoDao = new GoodsInfoDao();
		GoodsTypeDao typeDao = new GoodsTypeDao();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("goods", infoDao.finds(rows));
		map.put("types", typeDao.finds());
		return map;
	}
	
	public Map<String, String> findByGno(String gno) {
		if (StringUtil.checkNull(gno)) {
			return Collections.emptyMap();
		}
		GoodsInfoDao infoDao = new GoodsInfoDao();
		return infoDao.findByGno(gno);
	}
}
