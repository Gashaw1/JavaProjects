import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFile {
	
	public static boolean IsFileReadable(File file)
	{
		return file.canRead();		
	}
	
	//return newer file
	public static File CopyFileTo(String newFilename, String fromOrigFilename) throws IOException 
	{ 
		File newfile = null;
		PrintWriter printWriter = null;
		if (IsFileExist(newFilename) && IsFileExist(fromOrigFilename))
		{
			newfile = new File(newFilename);
			
			FileReader fr = new FileReader(fromOrigFilename);
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
			String currentLine;     			
		    
			while ((currentLine = br.readLine()) != null) 
			{    			
				//readFile += currentLine + "\n"; 
			    printWriter = new PrintWriter(newfile);
				printWriter.println(currentLine + "\n");								
				System.out.println("coping file : "+ currentLine + "...");				
			}		
			printWriter.close();
		}
		return newfile;
 	   
			
	}
    public static boolean IsFileExist(String filename)
    {
    	File file = new File(filename);
    	if(file.exists())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}    	
    }
    public static String CreateFile(String filename) throws IOException
    {
    	String IsfileCreated = "-1";  
    	File file = new File(filename);
    	if(!file.exists())
    	{
    		if(file.createNewFile())
    	    {
    	    	IsfileCreated = "1";
    	    } 
    	}    	
    	else
    	{
    		throw new IOException("File exist the same name " + filename);
    	}
    	return IsfileCreated;
    }
    public static String printFile(String filename) throws IOException
    {
    	String readFile = "";

    	 File mFile = new File(filename);
    	
    	 if(mFile.exists() && mFile.canRead())
    	 {    		    
    			FileReader fr = new FileReader(mFile.getAbsolutePath());
    			BufferedReader br = new BufferedReader(fr);
    			String currentLine;     			
    		    
    			while ((currentLine = br.readLine()) != null) 
    			{    				
    				readFile += currentLine + "\n";     				
    			}		 
    	 }	
		return readFile;
    }    

}
