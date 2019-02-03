

class Staff extends Employee {
	String title;

	public Staff(String title, String office, Double salary, MyDate dateHired, String name, String address,
			String phoneNumber, String emailAddress) {
		super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
		this.title = title;
	}

	public String toString() {

		return getClass().getSimpleName() + "\n	Title: " + this.title + "\n	Name: " + this.name + "\n	Address: "
				+ this.address + "\n	Phone: " + this.phoneNumber + "\n	Email: " + this.emailAddress
				+ "\n	Office: " + this.office +

				"\n	" + this.dateHired.year + "-" + this.dateHired.month + "-" + this.dateHired.day;

	};
};