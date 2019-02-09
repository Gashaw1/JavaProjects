
//Gashawbeza Amalto
public class MyLab2A {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		System.out.println("OUT PUT");
		
		Person person = new Person("Selemon Teddy", "3030PeachTree RD", "333 333 3333", "sample@email.com");
		System.out.println(person);
		Student student = new Student(2, "sss", "Adem Tad", "44Ponce EW", "@smaple23.com");
		System.out.println(student);
		MyDate date = new MyDate("110", "2", 2);
		Employee emp = new Employee("2A", 33.5, date, "Teddy Petter", "333Buford HWY NE", "555 555 5555",
				"sample11@email.com");
		System.out.println(emp);
		Faculty faculty = new Faculty("7AM to 9PM", 1, "A405", 33.5, date, "Blent", "44430PeachTree RD", "444 444 4444",
				"sample22@email.com");
		System.out.println(faculty);
		Staff staff = new Staff("Manager", "B245", 33.5, date, "Selemon Teddy", "44430PeachTree RD", "444 444 4444",
				"sample22@email.com");
		System.out.println(staff);
		
		
	


	}

}
