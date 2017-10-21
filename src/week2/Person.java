package week2;

public class Person {
	public static void inc () {
		counter ++ ; 
	}
	private static int counter = 0 ;
	private String firstName = "sonia" ;
	private String lastName = "Kaboor" ;
	private String address = "Bollywood" ;
	private int dateOfBirth = 1980 ;
	private String nationality = "indian" ;
	private String city = "mombi" ;
	private int wieght = 50 ;
	private int hight = 165 ;
	Boolean isMale = false ;

	public void Person () {
	}
	public void Person (String firstName , String lastName , String address , int dateOfBirth , String nationality , String city , int wieght , int hight , Boolean isMale) {
		this.firstName = firstName ;
		this.lastName = lastName ;
		this.address = address ;
		this.dateOfBirth = dateOfBirth ;
		this.nationality = nationality ;
		this.city = city ;
		this.wieght = wieght ;
		this.hight = hight ;
		this.isMale= isMale;
	}
	public String getFullName () {
		return this.firstName + " " + this.lastName ;
	}
	public double getHieghtInFeet () {
		return this.hight * 0.0328084;
	}
	public int getAge () {
		return 2017 - this.dateOfBirth;
	}
	public void eating () {
		wieght ++;
		System.out.println("I’m eating!");
	}
	public void info () {
		System.out.println(this.counter);
		System.out.println(this.firstName );
		System.out.println(this.lastName );
		System.out.println(this.address );
		System.out.println(this.dateOfBirth );
		System.out.println(this.nationality );
		System.out.println(this.city );
		System.out.println(this.wieght );
		System.out.println(this.hight );
	}
	public String getfirstName  () {
		return this.firstName ;
		}
		public void setfirstName (String firstName) {
		  this.firstName = firstName ;
		}
		public String getlastName  () {
		return this.lastName ;
		}
		public void setlastName (String lastName) {
		  this.lastName = lastName ;
		}
		public String getaddress  () {
		return this.address ;
		}
		public void setaddress (String address) {
		  this.address = address ;
		}
		public int getdateOfBirth  () {
		return this.dateOfBirth ;
		}
		public void setdateOfBirth (int dateOfBirth) {
		  this.dateOfBirth = dateOfBirth ;
		}
		public String getnationality  () {
		return this.nationality ;
		}
		public void setnationality (String nationality) {
		  this.nationality = nationality ;
		}
		public String getcity  () {
		return this.city ;
		}
		public void setcity(String city) {
		  this.city = city ;
		}
		public int getwieght  () {
		return this.wieght ;
		}
		public void setwieght (int wieght) {
		  this.wieght = wieght ;
		}
		public int gethight  () {
		return this.hight ;
		}
		public void sethight (int hight) {
		  this.hight = hight ;
		}
		public Boolean getisMale () {
		return this.isMale;
		}
		public void setisMale(Boolean isMale) {
		  this.isMale= isMale;
		}
	
}
