import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEditor 
{
	
	private static String absoluteFileName;
	static File file;
	static PrintWriter write;
	public FileEditor()
	{}
	public FileEditor(String fileName, String filePath) throws IOException
	{
		
		new File(absoluteFileName);
		
	}
	static boolean IsFileExist(String absFileName) throws IOException
	{
		boolean isExist = false;
        File file = new File(absFileName);		
		if(file.exists())
		{
			isExist = true;		  
		}
		System.out.println(absFileName + " exist " + isExist);
		return isExist;		
	}
	public static File GetFile(String absFileName) throws IOException 
	{
		File file = null;
		if(IsFileExist(absFileName))
		{
			file = new File(absFileName);	
			//PrintReader 
		}
		System.out.println(absFileName + " " + file);
		return file;	
		
	}
	public static String CreatFile(String absFileName) throws IOException
	{		
		String fileCreated = "1";	
	    if(!IsFileExist(absFileName))
		{
	    	File file = new File(absFileName);	
	    	file.createNewFile();
	    	file.getClass();
	    	System.out.println(file.getName() + "file created successfuly \n" + fileCreated);
		}
		else
		{
			fileCreated= "-1";
			throw new IOException(" file already exist!\n" + fileCreated);
						
		}
		return fileCreated;
	}
	public String AddContentToFile(String absFileName, String fileContent) throws IOException
	{
		String contentAdd = "-1";
		if(IsFileExist(absFileName))
		{
			File file = new File(absFileName);
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.println(fileContent);            
			printWriter.close();
			contentAdd = "1";		
			
			System.out.println("content add " + contentAdd);
		}		
		return contentAdd;
	}
	public boolean DelteFile(String absfileName) throws IOException
	{
		boolean isFileDeleted = false;
		if(IsFileExist(absfileName))
		{
			 new File(absfileName).delete();
			 isFileDeleted = true;		 
		}	
		System.out.println(absfileName + " file deleted " + isFileDeleted);
		return isFileDeleted;
	}	
}
			
