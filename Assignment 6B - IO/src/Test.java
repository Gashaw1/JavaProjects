

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Gashawbeza amalto
public class Test {

	public static void main(String[] args) throws IOException {

		String basePath = "C:\\Users\\User\\Desktop\\";
		boolean yes = true;
		
		do {
			System.out.println("\n		open your existing file by typing file name");

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

			String userInput = scanner.next();

			String absName = basePath + userInput;

			if(MyFile.IsFileExist(absName))
			{
				String res = MyFile.ReadTheFile(absName);

				System.out.print(res);

				System.out.println("		Do you want copy this file? yes/no ");

				userInput = scanner.next().toLowerCase();

				if (userInput.contentEquals("yes")) {
					
					System.out.println("		Enter the file name you want to copiy to it");
					userInput = scanner.next().toLowerCase();

					if (!MyFile.IsFileExist(basePath + userInput)) 
					{						
						String result = MyFile.CreateFile(basePath + userInput);
						System.out.println("		you created new file as " + userInput );
						System.out.println(result);						
						MyFile.CopyFileTo(basePath + userInput, absName);
						System.out.print("	File copied..  \n Form " + absName + "\n To " +  userInput);
					}
					else if(MyFile.IsFileExist(basePath + userInput))
					{	
						String tempUserResponse = userInput;
						
						
						
						System.out.println("			WARNING!!!");
						System.out.println("		You are about to overwrite the existing file or change the file on "+ userInput);
						System.out.println("	If you want to continue press (1)"  );
						System.out.println("	If you wish to give a new name press (2)"  );
						
						
						userInput = scanner.next().toLowerCase();
						
						if(userInput.equals("1"))
						{
							
							MyFile.CopyFileTo(basePath +tempUserResponse, absName);
							
							System.out.print("	File copied..  \n Form " + absName + "\n To " +  tempUserResponse);
						}
						else if(userInput.equals("2"))
						{
							System.out.println("		Enter new filename ");
							userInput = scanner.next().toLowerCase();
							if(MyFile.CreateFile(userInput)=="1")
							{
								//System.out.print();
								MyFile.CopyFileTo(basePath +userInput, absName);
								System.out.print("File Copied form " + absName + " to " +  userInput);
							}
						}
						//System.out.println(userInput + " file name inuse \n try another name!");
					}				

				}
				else if(userInput.contentEquals("no"))
				{
					yes = false;
				}
				else
				{
					System.out.print("TYPE YES or NO !!! ");
					yes = true;
				}	
			}
			else
			{
				System.out.println("File not found!");
			}
			
		} while (yes);
		
	}

}
