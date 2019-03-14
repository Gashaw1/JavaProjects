
public class Test {

	public static void main(String[] args) {
	

		
		Bird b = new Bird("Test");
		Bird b1 = new Bird("Test");
		Bird b2 = new Bird("Testeee");
		Bird b3 = new Bird("Test1");
	
		BirdSurvey br = new BirdSurvey();
		
		br.add(b);
		br.add(b1);
		br.add(b2);
		br.add(b3);
		
		br.GetReprord();
	}

}
