package com.in.inheritance;

public class InheritanceTemplate {

	private int id;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	private String Name;
	
}
class User extends InheritanceTemplate
{
	private String socialPlatfrom;
	private String occupation;
	public String getSocialPlatfrom() {
		return socialPlatfrom;
	}
	public void setSocialPlatfrom(String socialPlatfrom) {
		this.socialPlatfrom = socialPlatfrom;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public User(int id, int age, String name,String socialPlatform, String occupation)
	{
		this.setId(id);
		this.setAge(age);
		this.setName(name);
		this.setSocialPlatfrom(socialPlatform);
		this.setOccupation(occupation);
		System.out.println("Constructor of User class, but I do have access of the properties inside the InheritanceTemplate class as well.");
	}
}


