package com.yc.fresh.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class MemberController extends BasicController{
	private static final long serialVersionUID = -4756902676311093819L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		
		if ("login".equals(op)) {
			login(request, response);
		} else if ("check".equals(op)) {
			check(request, response);
		}
	}

	/**
	 * 检查会员登录
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void check(HttpServletRequest request, HttpServletResponse response) throws IOException {
		this.send(response, 500, null);
	}

	private void login(HttpServletRequest request, HttpServletResponse response) {
		
	}
}
