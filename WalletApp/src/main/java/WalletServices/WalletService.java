package WalletServices;

import java.util.Date;

import com.word.entity.Account;
import com.word.entity.Transction;
import com.word.repo.WalletDao;

public class WalletService {

	private WalletDao dao;
	public WalletService()
	{
		dao = new WalletDao();
	}
	public void createWallet(String name, int amount) {
		Account ac = new Account(name, amount);
		dao.getMp().put(ac.getAcId(), ac);
		System.out.println("Account is Created");
	}

	public void transfer(int from, int to, int amount1) {
		if(from == to)
		{
			System.out.println("Both account are same");
			return;
		}
		if(amount1<0)
		{
			System.out.println("Enter valid amount");
			return;
		}
		if(!dao.getMp().containsKey(from) || !dao.getMp().containsKey(to))
		{
			System.out.println("Acount Doesn't Exist");
		}
		
		Account a1 = dao.getMp().get(from);
		Account a2 = dao.getMp().get(to);
		if(a1.getAmount()<amount1)
		{
			System.out.println("Insufficient Balance");
		}
		
		Transction ts = new Transction(from, to, amount1, new Date());
		
		a1.getTs().add(ts);
		a2.getTs().add(ts);
		a1.setAmount(a1.getAmount()-amount1);
		a2.setAmount(amount1+a2.getAmount());
		System.out.println("Transection Successful.");
		
	}

	public void statement(int nextInt) {
		Account ac = dao.getMp().get(nextInt);
		System.out.println(ac.getAcId() +" "+ac.getAmount());
	}

	public void overview() {
		for(int acnum: dao.getMp().keySet())
		{
			System.out.println("Balance for account:" + acnum);
			System.out.println(dao.getMp().get(acnum).getAmount());
		}
	}

}
