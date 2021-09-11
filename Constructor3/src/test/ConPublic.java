package test;
public class ConPublic {
	public String school;
	public String city;
	public ConPublic(String school,String city) {
		this.school=school;
		this.city=city;
	}
	public void DisplaySchool() {
		System.out.println("The school name is :"+this.school);
		System.out.println("The city name is :"+this.city);
	}

}
