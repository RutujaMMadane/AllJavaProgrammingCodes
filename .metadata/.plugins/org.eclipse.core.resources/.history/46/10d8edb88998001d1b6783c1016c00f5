package FileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream file=new FileInputStream("ListOfCourses.txt");
		    BufferedReader reader=new BufferedReader(new InputStreamReader(file));
		    String line;
		    while((line=reader.readLine())!=null)
		    {
		    	System.out.println(line);
		    	
		    }
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
