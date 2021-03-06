

abstract class GeometricObject {
	abstract double getParameter();
	abstract double getArea();
}
class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	double side = 0;

	public Octagon()
	{
		
	}
	public String tests()
	{
		String f ="xxx";
		String x = "xxxx";
		x.toUpperCase();
		x.toLowerCase();
		f.indexOf(2);
		f.concat(x);
		f.compareTo(x);
		x.contentEquals(f);
		return "";
	}
	public Octagon(double side) {
		this.side = side;
	}

	@Override
	double getArea() {

		return (2 + (4 / (Math.sqrt(2))) * this.side * this.side);
	}

	@Override
	double getParameter() {

		return this.side * 8;
	}

	@Override
	public String toString() {
		return "Area: " + this.getArea() + "\nParameter: " + this.getParameter();
	}

	@Override
	public int compareTo(Octagon o) {
		if (this.getArea() == o.getArea()) {
			return 0;
		}
		else if(this.getArea() > o.getArea())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	@Override
	public Octagon clone() {
		return new Octagon(this.side);
	}
	public static boolean IsEqual(int i) {
		boolean result = false;
		if (i == 0)
		{
			result = true;
		}	
		return result;
	}
}

class a
{}
class b{}
class c extends b
{
	
}
public class Lab2BTestMain {
	
	public static void main(String[] args)
	{
		
		
		Octagon oct = new Octagon(8);
		System.out.println(oct);
		Octagon oct2 = new Octagon();
		oct2 = oct.clone();
		int result = oct.compareTo(oct2);

		// Octagon.IsEqual(result);

		System.out.println(": " + Octagon.IsEqual(result));

		
	}
}
