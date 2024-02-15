package com.word.entity;

import java.util.Date;
public class Transction {
	private int from;
	private int to;
	private int amount;
	private Date date;
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Transction(int from, int to, int amount, Date date) {
		super();
		this.from = from;
		this.to = to;
		this.amount = amount;
		this.date = date;
	}
	
	
}
