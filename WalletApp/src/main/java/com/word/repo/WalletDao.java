package com.word.repo;

import java.util.HashMap;
import java.util.Map;

import com.word.entity.Account;

public class WalletDao {
	private Map<Integer, Account>mp;

	
	public WalletDao() {
		this.mp = new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	public Map<Integer, Account> getMp() {
		return mp;
	}

	public void setMp(Map<Integer, Account> mp) {
		this.mp = mp;
	}
	
	
	
}
