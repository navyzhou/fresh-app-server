package com.yc.fresh.dao;

import java.util.List;
import java.util.Map;

public class GoodsInfoDao {
	/**
	 * 首页查询
	 * @param rows
	 * @return
	 */
	public List<Map<String, String>> finds(int rows) {
		DBHelper db = new DBHelper();
		String sql = "select gno, gname, price, pics, tno from goodsinfo gf1 where ? > "
				+ "(select count(gno) from goodsinfo gf2 where gf1.tno = gf2.tno and gf1.gno < gf2.gno) order by gf1.tno asc, gf1.gno desc";
		return db.finds(sql, rows);
	}
}
