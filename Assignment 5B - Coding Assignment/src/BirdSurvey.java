
import java.util.LinkedList;

class Bird {
	String BirdName;

	public Bird()
	{
		BirdName = "";
	}
	public Bird(String BirdName) {
		this.BirdName = BirdName;
	}
}

public class BirdSurvey {
	int count;
	String types;

	public BirdSurvey()
	{
		
	}
	private BirdSurvey(int count, String types) {
		this.count = count;
		this.types = types;
	}

	LinkedList<Bird> birdlinkList = new LinkedList<Bird>();

	public void add(Bird bird) {
		birdlinkList.add(bird);
	}

	int getCount(String birdName) {

		int count = 0;
		for (int i = 0; i <= birdlinkList.size()-1; i++) {
			if (birdlinkList.get(i).BirdName == birdName) {
				count += 1;
			}
		}
		return count;
	}

	public void GetReprord() {
		
		

		for (int i = 0; i < birdlinkList.size(); i++)
		{
			
		  String name = birdlinkList.get(i).BirdName;
		  int count = getCount(name);
		  
		  System.out.println("Name : " + name + " count " + count);

		}
	
		//print
		

	}

}
