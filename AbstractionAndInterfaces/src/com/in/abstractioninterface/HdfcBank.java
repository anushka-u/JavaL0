package com.in.abstractioninterface;
public class HdfcBank implements RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank d = new HdfcBank();
		d.cashWithdrawl();
		d.checkBalance();
		d.moneyTransfer();

	}

	@Override
	public void moneyTransfer() {
		// TODO Auto-generated method stub
		System.out.println("Money Transfered");		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("The Amount in your Account is ########");
		
	}

	@Override
	public void cashWithdrawl() {
		// TODO Auto-generated method stub
		System.out.println("You have withdrawled Amount ****");
		
	}

}
