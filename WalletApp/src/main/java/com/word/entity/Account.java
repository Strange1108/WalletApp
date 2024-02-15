package com.word.entity;

import java.util.Set;
import java.util.TreeSet;

import com.word.utility.GenerateAcNo;

public class Account {
	private int AcId;
	private int amount;
	private User user;
    private Set<Transction> ts;
	public int getAcId() {
		return AcId;
	}
	public void setAcId(int acId) {
		AcId = acId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Transction> getTs() {
		return ts;
	}
	public void setTs(Set<Transction> ts) {
		this.ts = ts;
	}
	public Account(String name, int amount) {
		super();
		AcId = GenerateAcNo.GenerateAc();
		this.amount = amount;
		this.user = new User(name);
		this.ts = new TreeSet<>((a,b)-> a.getDate().compareTo(b.getDate()));
	}
}
