import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEditor 
{
	static String fileName;
	static File file;
	static PrintWriter write;
	
	public FileEditor(File file)
	{
		
	}
	public static void GetFile()
	{
       
	}
	public static File GetFile(String fileName) throws IOException
	{
		File file = new File(fileName);
		
		if(!file.exists())
		{
		   throw new IOException("File not fund!");
		}
		else
		{
			return file;
		}
	}
	public static void PostFile(File file) throws IOException
	{
		if(file.exists())
		{
			throw new IOException("File already exist!");
		}
		else
		{
		     write = new PrintWriter(file);
		}
	}
	public static String PutFile(File file, String fileName)
	{
		return "";
	}
	public static boolean DelteFile() throws IOException
	{
		boolean isFileDeleted = false;
		file = new File(fileName);
		if(file.exists())
		{
			file.delete();
			isFileDeleted = true;
		}
		else
		{
			isFileDeleted = false;
			throw new IOException("File not exist!");			
		}
		return isFileDeleted;
	}	
}
			
