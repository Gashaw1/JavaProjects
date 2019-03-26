import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args)
	{
		//System.out.println(new FileEditor().file);
		
		try 
		{
			FileEditor fileEditor = new FileEditor();			
			//fileEditor.CreatFile("C:\\Users\\User\\Desktop\\akal.java");	
			fileEditor.GetFile("C:\\Users\\User\\Desktop\\akal.java");
			fileEditor.AddContentToFile("C:\\Users\\User\\Desktop\\akal.java","aasssa");
			//fileEditor.DelteFile("C:\\Users\\User\\Desktop\\akal.java");	
		} 
		catch (IOException e) 
		{			
			System.out.println(e.getMessage());
		}
		
		

	}

}
