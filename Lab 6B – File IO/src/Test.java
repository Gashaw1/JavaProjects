import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	static BufferedReader br = null;
	static FileReader fr = null;
	
	
	public static void main(String[] args) {
		// System.out.println(new FileEditor().file);

		try {
			FileEditor fileEditor = new FileEditor();
				
			//fileEditor.CreatFile(absFileName)
			fileEditor.WrtiteContentToFile("C:\\Users\\User\\Desktop\\akal.java", "aasssa");
			
			
			File file = fileEditor.GetFile("C:\\Users\\User\\Desktop\\Assigment4B\\Test.java");

			fr = new FileReader(file.getAbsolutePath());
			br = new BufferedReader(fr);

			String sCurrentLine;

			System.out.println("file reader \n");
			while ((sCurrentLine = br.readLine()) != null) 
			{
				System.out.println(sCurrentLine);
			}
			
			// fileEditor.DelteFile("C:\\Users\\User\\Desktop\\akal.java");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
