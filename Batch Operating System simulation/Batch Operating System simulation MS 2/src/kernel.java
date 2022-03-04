import java.io.*;
import java.util.*;
public class kernel {
	private static BufferedReader inputFile;
	private static BufferedReader inputConsole;
	private static PrintWriter outputConsole;
	private static PrintWriter outputFile;
	public kernel() {
	      inputConsole=new BufferedReader(new InputStreamReader(System.in));
	      outputConsole=new PrintWriter(System.out,true);
	}
	public static String readFile(String path) throws FileNotFoundException {
		System.out.println("we will now read the file");
		StringBuilder sb=new StringBuilder();

		try{
			inputFile=new BufferedReader(new FileReader(path));
			while(inputFile.ready()) {
				sb.append(inputFile.readLine());
				sb.append("\n");
			}
		}
		catch (Exception e) {
			print("File path doesn't exist");
		}
		
		return sb.toString();
	}

	public static void writeFile(String path,String data) throws IOException
	{  
		System.out.println("we will now write into the file please enter anything");
		File newFile = new File(path);
		if(!newFile.exists())
		{
			newFile.createNewFile();
		}
		outputFile=new PrintWriter(new FileWriter(newFile,true));
		outputFile.println(data);
		outputFile.close();
	}

	public static void print(String data)
	{
		outputConsole.print(data);
		outputConsole.flush();
	}

	public static String takeInput() throws IOException
	{
		String s = inputConsole.readLine();
		return s;	
	}
}
