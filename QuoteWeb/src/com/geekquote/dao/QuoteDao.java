package com.geekquote.dao;

import java.util.List;

import com.geekquote.entity.Quote;

public interface QuoteDao {

	List<Quote> getAllQuotes();
	void addQuote(Quote q);
	Quote getQuoteById(int id);
	void removeQuote(int id);
}
