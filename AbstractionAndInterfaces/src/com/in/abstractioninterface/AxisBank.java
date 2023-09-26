package com.in.abstractioninterface;

public class AxisBank implements RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axisBank = new AxisBank();
		axisBank.cashWithdrawl();
		axisBank.checkBalance();
		axisBank.moneyTransfer();

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
