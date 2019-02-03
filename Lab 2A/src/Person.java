
public class Person
{
		String name;
		String address;
		String phoneNumber;
		String emailAddress;

		public Person() 
		{
		};

		public Person(String name, String address, String phoneNumber, String emailAddress) {
			this.name = name;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.emailAddress = emailAddress;
		}

		@Override
		public String toString() 
		{	
			return getClass().getSimpleName() + 
					"\n	Name: " + this.name +
					"\n	Address: " + this.address +
					"\n	Phone: " + this.phoneNumber +
					"\n	Email: " + this.emailAddress;
		};
	}

