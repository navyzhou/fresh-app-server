package com.yc.fresh.biz;

import java.util.HashMap;
import java.util.Map;

import com.yc.fresh.dao.GoodsInfoDao;
import com.yc.fresh.dao.GoodsTypeDao;

public class GoodsInfoBiz {
	public Map<String, Object> finds(int rows) {
		GoodsInfoDao infoDao = new GoodsInfoDao();
		GoodsTypeDao typeDao = new GoodsTypeDao();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("goods", infoDao.finds(rows));
		map.put("types", typeDao.finds());
		return map;
	}
}
