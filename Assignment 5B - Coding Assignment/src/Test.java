
public class Test {

	public static void main(String[] args) {
	

		
		Bird b = new Bird("Turkey");
		Bird b1 = new Bird("Eagle");
		Bird b2 = new Bird("Heron");
		Bird b3 = new Bird("Owl");
		Bird b4 = new Bird("Owl");
	
	
		BirdSurvey br = new BirdSurvey();
		
		br.add(b);
		br.add(b1);
		br.add(b2);
		br.add(b3);
		br.add(b4);
		
		
		br.GetReprord();
	}

}
