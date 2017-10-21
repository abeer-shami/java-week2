package week2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ashar = new Person ();
		System.out.println(ashar.getFullName());
		System.out.println(ashar.getHieghtInFeet());
		System.out.println(ashar.getAge());
		ashar.eating();
		Person ashar1 = new Person ();
		Person ashar2 = new Person ();
		Person ashar3 = new Person ();

		ashar1.inc();ashar2.inc();ashar.inc();ashar3.inc();
		//ashar.info();
		Person [] People = {ashar ,ashar1 ,ashar2 ,ashar3} ;
		People[0].info();
	}

}
