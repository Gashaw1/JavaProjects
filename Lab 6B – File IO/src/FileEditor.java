import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEditor {

	private static String absoluteFileName;
	static File file;
	static PrintWriter write;
	static BufferedReader br = null;
	static FileReader fr = null;


	public FileEditor() {
	}

	public FileEditor(String fileName, String filePath) throws IOException {

		new File(absoluteFileName);

	}

	static boolean IsFileExist(String absFilename) throws IOException {
		boolean isExist = false;
		File file = new File(absFilename);
		if (file.exists()) {
			isExist = true;
		}
		System.out.println(absFilename + " exist " + isExist);
		return isExist;
	}

	public File GetFile(String absFileName) throws IOException {
		File file = null;
		if (IsFileExist(absFileName)) {
			file = new File(absFileName);

			// PrintReader
		} else {
			System.out.println(absFileName + " " + file);
			throw new IOException("File not found !");
		}
		return file;

	}

	public static String CreatFile(String finlename, String fileDirectory) throws IOException {
		String absFileName = finlename + "" + fileDirectory;
		String fileCreated = "1";
		if (!IsFileExist(absFileName)) {
			File file = new File(absFileName);
			file.createNewFile();
			file.getClass();
			System.out.println(file.getName() + "file created successfuly \n" + fileCreated);
		} else {
			fileCreated = "-1";
			throw new IOException(" file already exist!\n" + fileCreated);

		}
		return fileCreated;
	}

	// return 1 if file created -1 if not
	public static String CreatFile(String absFileName) throws IOException {
		String fileCreated = "1";
		if (!IsFileExist(absFileName)) {
			File file = new File(absFileName);
			file.createNewFile();
			file.getClass();
			System.out.println(file.getName() + "file created successfuly \n" + fileCreated);
		} else {
			fileCreated = "-1";
			throw new IOException(" file already exist!\n" + fileCreated);

		}
		return fileCreated;
	}

	public String WrtiteContentToFile(String absFilename, String fileContent) throws IOException {
		String contentAdd = "-1";
		if (IsFileExist(absFilename)) {
			File file = new File(absFilename);
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.println(fileContent);
			printWriter.close();
			contentAdd = "1";

			System.out.println("content add " + contentAdd);
		}
		return contentAdd;
	}

	public String ReadFile(String filename) throws IOException 
	{
		String readedFile = "";
	
		file = GetFile(filename);
		
	    
	    fr = new FileReader(file.getAbsolutePath());
		br = new BufferedReader(fr);

		String currentLine;

		
		System.out.println("file reader \n");
		
	    readedFile = "";
		while ((currentLine = br.readLine()) != null) 
		{		
			
			readedFile += currentLine + "\n"; 
			
			//System.out.println(currentLine);
		}		
		return readedFile;
	}

	public boolean DelteFile(String absFilename) throws IOException {
		boolean isFileDeleted = false;
		if (IsFileExist(absFilename)) {
			new File(absFilename).delete();
			isFileDeleted = true;
		}
		System.out.println(absFilename + " file deleted " + isFileDeleted);
		return isFileDeleted;
	}
}
