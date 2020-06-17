package com.yc.fresh.dao;

import java.util.List;
import java.util.Map;

public class GoodsTypeDao {
	/**
	 * 查询所有商品类型
	 * @param rows
	 * @return
	 */
	public List<Map<String, String>> finds() {
		DBHelper db = new DBHelper();
		String sql = "select tno, tname, pic, status from goodstype order by tno";
		return db.finds(sql);
	}
}
