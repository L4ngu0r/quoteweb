package com.geekquote.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.geekquote.dao.DaoFactory;
import com.geekquote.dao.QuoteDao;
import com.geekquote.entity.Quote;

@WebServlet("/addQuote")
public class AddQuoteServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private QuoteDao quoteDao;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.sendRedirect(getServletContext().getContextPath()+"/addQuote.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String str = req.getParameter("description");
		String rate = req.getParameter("rating");
		
		Quote q = new Quote();
		q.setStrQuote(str);
		q.setRating(Integer.parseInt(rate));
		SimpleDateFormat simpDate = new SimpleDateFormat("dd/MM/yyyy");
		String date = simpDate.format(new Date());
		q.setDate(date);
		System.out.println(quoteDao);
		quoteDao.addQuote(q);
		resp.sendRedirect(getServletContext().getContextPath());
	}

	@Override
	public void init() throws ServletException {
		quoteDao = DaoFactory.getInstance().getQuoteDao();
	}
	
	
}
