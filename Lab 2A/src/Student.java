

class Student extends Person
{
	String status;
	final String statusList[] = { "freshman", "sophomore", "junior", "senior" };

	public Student(int statusIndex, String name, String address, String phoneNumber, String emailAddress)
	{
		super(name, address, phoneNumber, emailAddress);
		this.status = statusList[statusIndex].toString();

	}

	@Override
	public String toString() {

		// return getClass().getSimpleName();
		return getClass().getSimpleName() + "\n	Name: " + this.name + "\n	Address: " + this.address + "\n	Phone: "
				+ this.phoneNumber + "\n	Email: " + this.emailAddress + "\n	Status: " + this.status;
	}
};



