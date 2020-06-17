package com.yc.fresh.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.fresh.biz.GoodsInfoBiz;

@WebServlet("/goods")
public class GoodsController extends BasicController{
	private static final long serialVersionUID = -4756902676311093819L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		
		if ("finds".equals(op)) {
			finds(request, response);
		}
	}

	private void finds(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String agent = request.getHeader("User-Agent"); // 代理、原动力
		GoodsInfoBiz goodsBiz = new GoodsInfoBiz();
		Map<String, Object> map = null;
		if (agent.matches(".*Android.*") || agent.matches(".*iPhone.*") || agent.matches(".*iPad.*")) {
			map = goodsBiz.finds(6);
		} else {
			map = goodsBiz.finds(4);
		}
		this.send(response, map);
	}
}
