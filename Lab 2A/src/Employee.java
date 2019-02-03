

class Employee extends Person {
	String office;
	Double salary;
	MyDate dateHired;

	public Employee(String office, Double salary, MyDate dateHired, String name, String address, String phoneNumber,
			String emailAddress) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {

		return getClass().getSimpleName() + "\n	Name: " + this.name + "\n	Address: " + this.address + "\n	Phone: "
				+ this.phoneNumber + "\n	Email: " + this.emailAddress + "\n	Office: " + this.office
				+ "\n	Salary: " + this.salary + "\n	Date: " + this.dateHired.year + "-" + this.dateHired.month + "-"
				+ this.dateHired.day;

	};

};
