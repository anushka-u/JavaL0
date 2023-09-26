package com.in.abstractioninterface;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI rbi; //Reference variable of RBI interface
		rbi = new AxisBank(); // Refernece variable is holding object of AxisBank class
		rbi.cashWithdrawl();//calling cashwithdrawl method implemented inside AxisBank class
		rbi.checkBalance();// calling check Balance method implemented inside Axis Bank class
		rbi.moneyTransfer();
		
		rbi= new HdfcBank(); // Reference variable is holding object of hdfcBank class
		rbi.cashWithdrawl();//calling method implemented inside HdfcBank class
		rbi.checkBalance();
		rbi.moneyTransfer();

	}

}
