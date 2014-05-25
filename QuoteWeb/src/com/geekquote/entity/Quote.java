package com.geekquote.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="quotes")
@XmlRootElement
public class Quote implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	private int id;
	private String strQuote;
	private String date;
	private int rating;
	
	public String getStrQuote() {
		return strQuote;
	}
	public void setStrQuote(String strQuote) {
		this.strQuote = strQuote;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return strQuote;
	}
	
}
