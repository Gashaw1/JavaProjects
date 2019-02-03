

class Faculty extends Employee {
	public String officeHour;
	public int rank;

	public Faculty(String officeHour, int rank, String office, Double salary, MyDate dateHired, String name,
			String address, String phoneNumber, String emailAddress) {
		super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
		this.officeHour = officeHour;
		this.rank = rank;
	}

	@Override
	public String toString() {

		return getClass().getSimpleName() +

				"\n	Name: " + this.name + "\n	Address: " + this.address + "\n	Phone: " + this.phoneNumber
				+ "\n	Email: " + this.emailAddress + "\n	Office: " + this.office + "\n	Salary: " + this.salary
				+ "\n	Office Hour " + this.officeHour + "\n	Rank: " + this.rank + "\n	Date: "
				+ this.dateHired.year + "-" + this.dateHired.month + "-" + this.dateHired.day;

	};
};
