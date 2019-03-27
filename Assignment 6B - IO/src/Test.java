import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		
		String baseAddress = "C:\\Users\\User\\Desktop\\";
		boolean r = true;
		//MyFile myFile = new MyFile();
		do
		{
		   System.out.println("Type your file name");		   
		   
		   @SuppressWarnings("resource")
		   Scanner scanner = new Scanner(System.in);
		   
		   String userInput = scanner.next();
		   
		   String absName = baseAddress + userInput;
		   String res = MyFile.printFile(absName);
		  
		   System.out.print("r" + res);
		   
		   System.out.println("Do you want copy this file? yes/no ");
		   
		   userInput = scanner.next().toLowerCase();
		  
		   if(userInput.contentEquals("yes"))
		   {
			   //File newFile =  ;
			   System.out.println("Enter new filename");			   
			   userInput = scanner.next().toLowerCase();
			   
			   if(!MyFile.IsFileExist(baseAddress+ userInput))
			   {
				   String result = MyFile.CreateFile(baseAddress+ userInput);
				   System.out.print(result);				   
			   }
			   else
			   {
				   System.out.println(baseAddress+ userInput + " inuse \n try another name!");
			   }
			  
			  
			  MyFile.CopyFileTo(baseAddress+ userInput, absName);
			 
		   }
		   
		}
		while(r);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		File file = null;
		//Scanner scanner = new Scanner(file);

		// TODO Auto-generated method stub
		// boolean result = MyFile.IsFileExist("C:\\Users\\User\\Desktop\\sample.text");

		// System.out.print("File exist: " + result);

		String result = "";
		try {
			result = MyFile.CreateFile("C:\\Users\\User\\Desktop\\akal.txt");
			System.out.println(result);
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		try 
		{
			String rResult = MyFile.printFile("C:\\Users\\User\\Desktop\\akal.txt");
		    System.out.println("Read" + rResult);
			
		}
		catch (IOException e)
		{
			e.getLocalizedMessage();
			//e.printStackTrace();
		}
		
		//File newFile = new File(,"")
		//File fil = MyFile.CopyFile("C:\\Users\\User\\Desktop\\akal.txt");
	

	}

}
