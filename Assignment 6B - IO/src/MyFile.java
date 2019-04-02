import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//Gashawbeza amalto
public class MyFile {
	
	public static boolean IsFileReadable(File file)
	{
		return file.canRead();		
	}
	//return copied file
	public static File CopyFileTo(String whereFilename, String fromFilename) throws IOException 
	{ 
		File newfile = null;
		PrintWriter printWriter = null;
		if (IsFileExist(whereFilename) && IsFileExist(fromFilename))
		{
			newfile = new File(whereFilename);
			
			FileReader fr = new FileReader(fromFilename);
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
			
			String currentLine;     			
		    String tempFile="";
			while ((currentLine = br.readLine()) != null) 
			{    			
				tempFile += currentLine + "\n"; 
			   			
			}		
			 printWriter = new PrintWriter(whereFilename);
			 printWriter.print(tempFile);								
			 
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
    	    	//System.out.print("file created " + IsfileCreated);
    	    } 
    	}    	
    	else
    	{
    		
    		throw new IOException("File exist the same name " + filename);
    	}
    	return IsfileCreated;
    }
    public static String ReadTheFile(String filename) throws IOException
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
