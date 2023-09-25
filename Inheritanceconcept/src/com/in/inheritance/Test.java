package com.in.inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User(13,22,"Anushka","Linkedin","SoftwareDeveloper");
		System.out.println("Id of User "+ user.getName() + " is " + user.getId()+" Age is "+ user.getAge()+
				" Social platform is "+ user.getSocialPlatfrom() + " Occupation is "+ user.getOccupation());
		
	}

}
