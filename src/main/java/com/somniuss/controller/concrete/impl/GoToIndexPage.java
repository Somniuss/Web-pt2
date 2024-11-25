package com.somniuss.controller.concrete.impl;

import java.io.IOException;

import com.somniuss.web.bean.Soundeffects;
import com.somniuss.web.controller.concrete.Command;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToIndexPage implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//stub
		Soundeffects soundeffect  = new Soundeffects();
		request.setAttribute("NewSoundeffect", soundeffect);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main_index.jsp");
		dispatcher.forward(request, response);
		
	}

}
